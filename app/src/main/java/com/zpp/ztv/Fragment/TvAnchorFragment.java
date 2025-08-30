package com.zpp.ztv.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tencent.mmkv.MMKV;
import com.zpp.ztv.HttpUtils.ApiObserver;
import com.zpp.ztv.HttpUtils.Entity.DouyinLiveResponse;
import com.zpp.ztv.HttpUtils.Entity.RoomBen;
import com.zpp.ztv.HttpUtils.Entity.RoomData;
import com.zpp.ztv.HttpUtils.Entity.UserIdBen;
import com.zpp.ztv.HttpUtils.Entity.UserInfoBen;
import com.zpp.ztv.HttpUtils.OllamaApi;
import com.zpp.ztv.HttpUtils.RetrofitClient;
import com.zpp.ztv.PlayerActivity;
import com.zpp.ztv.R;
import com.zpp.ztv.ViewModel.WebViewModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TvAnchorFragment extends Fragment {

    private RecyclerView recyclerView;
    private WebViewModel viewModel;
    private UserListAdapter adapter;
    private MMKV mmkv;
    private static final String STORAGE_KEY = "user_list_data";

    // 添加加载遮罩相关的变量
    private View loadingOverlay;
    private ProgressBar loadingProgressBar;

    public static TvAnchorFragment instance() {
        return new TvAnchorFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mmkv = MMKV.defaultMMKV();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tv_anchor_fragment, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        // 初始化加载遮罩
        loadingOverlay = view.findViewById(R.id.loading_overlay);
        loadingProgressBar = view.findViewById(R.id.loading_progress_bar);

        viewModel = new ViewModelProvider(requireActivity(), new ViewModelProvider.Factory() {
            @Override
            public <T extends ViewModel> T create(Class<T> modelClass) {
                return (T) new WebViewModel(RetrofitClient.getInstance().enableLogging(true).getApi(OllamaApi.class));
            }
        }).get(WebViewModel.class);
        getData();
        recyclerView = view.findViewById(R.id.recyclerView);

        // 使用适合TV的网格布局，设置3列
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(layoutManager);

        // 从MMKV加载已保存的数据
        List<UserInfoBen> savedList = loadSavedData();

        // 创建适配器并设置给RecyclerView
        adapter = new UserListAdapter(savedList);
        recyclerView.setAdapter(adapter);

        // 设置RecyclerView的焦点搜索逻辑，便于TV遥控器导航
        recyclerView.setFocusableInTouchMode(true);
        recyclerView.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);

        // 观察 ViewModel 中的数据
        viewModel.liveData.observe(getViewLifecycleOwner(), newData -> {
            if (newData != null && !newData.isEmpty()) {
                // 合并新数据和已保存的数据
                List<UserInfoBen> mergedList = mergeData(savedList, newData);
                adapter.updateData(mergedList);
                // 保存合并后的数据
                saveData(mergedList);
            }
        });
    }

    // 从MMKV加载已保存的数据
    private List<UserInfoBen> loadSavedData() {
        String json = mmkv.getString(STORAGE_KEY, "");
        if (json.isEmpty()) {
            return new ArrayList<>();
        }

        try {
            Type type = new TypeToken<List<UserInfoBen>>() {
            }.getType();
            return new Gson().fromJson(json, type);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // 保存数据到MMKV
    private void saveData(List<UserInfoBen> data) {
        String json = new Gson().toJson(data);
        mmkv.putString(STORAGE_KEY, json);
    }

    // 合并新数据和已保存的数据
    private List<UserInfoBen> mergeData(List<UserInfoBen> savedList, List<UserInfoBen> newList) {
        // 创建一个映射以便快速查找
        Map<String, UserInfoBen> mergedMap = new HashMap<>();

        // 首先添加所有已保存的项目
        for (UserInfoBen user : savedList) {
            String secUid = user.getData().getUser().getSec_uid();
            if (secUid != null) {
                mergedMap.put(secUid, user);
            }
        }

        // 然后更新或添加新项目
        for (UserInfoBen user : newList) {
            String secUid = user.getData().getUser().getSec_uid();
            if (secUid != null) {
                mergedMap.put(secUid, user);
            }
        }

        return new ArrayList<>(mergedMap.values());
    }

    // 显示加载遮罩
    private void showLoading() {
        if (loadingOverlay != null && loadingProgressBar != null) {
            loadingOverlay.setVisibility(View.VISIBLE);
            loadingProgressBar.setVisibility(View.VISIBLE);
            // 禁用用户交互
            loadingOverlay.setFocusable(true);
            loadingOverlay.setFocusableInTouchMode(true);
            loadingOverlay.requestFocus();

            // 禁用RecyclerView的交互
            if (recyclerView != null) {
                recyclerView.setEnabled(false);
                recyclerView.setAlpha(0.5f); // 半透明效果表示禁用状态
            }
        }
    }

    // 隐藏加载遮罩
    private void hideLoading() {
        if (loadingOverlay != null && loadingProgressBar != null) {
            loadingOverlay.setVisibility(View.GONE);
            loadingProgressBar.setVisibility(View.GONE);

            // 启用RecyclerView的交互
            if (recyclerView != null) {
                recyclerView.setEnabled(true);
                recyclerView.setAlpha(1.0f);
            }
        }
    }

    private void getData() {
        viewModel.resultUserInfoData.observe(getViewLifecycleOwner(), new ApiObserver<UserInfoBen>() {
            @Override
            public void onSuccess(UserInfoBen data, int code) {
                if (!getUserVisibleHint()) {
                    return;
                }
                // 隐藏加载遮罩
                hideLoading();

                if (data.getData().getUser().getLive_status() == 1) {
                    try {
                        RoomData roomData = new Gson().fromJson(data.getData().getUser().getRoom_data(), RoomData.class);
                        Intent intent = new Intent(getContext(), PlayerActivity.class);
                        intent.putExtra("url", roomData.getStream_url().getFlv_pull_url().getFULL_HD1());
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(getContext(), "无法播放此直播", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(getContext(), "当前主播未开播", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(int code, String message, Throwable error) {
                // 隐藏加载遮罩
                hideLoading();
                Toast.makeText(getContext(), "无法播放此直播", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // RecyclerView 的适配器
    private class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {
        private List<UserInfoBen> userList;

        public UserListAdapter(List<UserInfoBen> userList) {
            this.userList = userList;
        }

        public void updateData(List<UserInfoBen> newData) {
            this.userList = newData;
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_anchor_item, parent, false);
            return new UserViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
            UserInfoBen userInfoBen = userList.get(position);
            holder.nicknameTextView.setText(userInfoBen.getData().getUser().getNickname());

            // 使用Glide加载头像
            Glide.with(holder.avatarImageView.getContext())
                    .load(userInfoBen.getData().getUser().getAvatar_larger().getUrl_list().get(0))
                    .placeholder(R.drawable.placeholder_avatar)
                    .error(R.drawable.error_avatar)
                    .into(holder.avatarImageView);

            // 设置点击监听器
            holder.itemView.setOnClickListener(v -> {
                // 显示加载遮罩
                showLoading();
                viewModel.getUserInfo(userInfoBen.getData().getUser().getSec_uid());
            });

            // 设置长按监听器（可选）
            holder.itemView.setOnLongClickListener(v -> {
                // 可以在这里实现添加到收藏等功能
                Toast.makeText(getContext(), userInfoBen.getData().getUser().getNickname(), Toast.LENGTH_SHORT).show();
                return true;
            });
        }

        @Override
        public int getItemCount() {
            return userList.size();
        }

        class UserViewHolder extends RecyclerView.ViewHolder {
            ImageView avatarImageView;
            TextView nicknameTextView;
            TextView liveStatusTextView;
            View overlayView; // 添加覆盖层视图

            UserViewHolder(@NonNull View itemView) {
                super(itemView);
                avatarImageView = itemView.findViewById(R.id.avatarImageView);
                nicknameTextView = itemView.findViewById(R.id.nicknameTextView);
                liveStatusTextView = itemView.findViewById(R.id.liveStatusTextView);
                overlayView = itemView.findViewById(R.id.overlayView); // 初始化覆盖层

                // 为TV优化焦点变化效果
                itemView.setOnFocusChangeListener((v, hasFocus) -> {
                    if (hasFocus) {
                        // 放大动画
                        itemView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(200).start();
                        // 显示半透明覆盖层
                        overlayView.setVisibility(View.VISIBLE);
                        overlayView.setBackgroundColor(Color.argb(50, 255, 255, 255)); // 半透明白色
                    } else {
                        // 恢复动画
                        itemView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
                        // 隐藏覆盖层
                        overlayView.setVisibility(View.INVISIBLE);
                    }
                });
            }
        }
    }
}