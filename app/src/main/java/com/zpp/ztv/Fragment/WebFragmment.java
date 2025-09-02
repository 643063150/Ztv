package com.zpp.ztv.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.zpp.ztv.HttpUtils.ApiObserver;
import com.zpp.ztv.HttpUtils.Entity.DouyinLiveResponse;
import com.zpp.ztv.HttpUtils.Entity.RoomBen;
import com.zpp.ztv.HttpUtils.Entity.UserIdBen;
import com.zpp.ztv.HttpUtils.Entity.UserInfoBen;
import com.zpp.ztv.HttpUtils.OllamaApi;
import com.zpp.ztv.HttpUtils.RetrofitClient;
import com.zpp.ztv.R;
import com.zpp.ztv.ViewModel.WebViewModel;
import com.zpp.ztv.WebServer;
import com.zpp.ztv.Utils.DisplayQRCode; // 假设这个类存在

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WebFragmment extends Fragment {
    private WebServer webServer;
    private TextView ip_txt;
    private ImageView qr_code;

    WebViewModel viewModel;

    public static WebFragmment getInstance() {
        return new WebFragmment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(requireActivity(), new ViewModelProvider.Factory() {
            @Override
            public <T extends ViewModel> T create(Class<T> modelClass) {
                return (T) new WebViewModel(RetrofitClient.getInstance().enableLogging(true).getApi(OllamaApi.class));
            }
        }).get(WebViewModel.class);
        getData();
        return inflater.inflate(R.layout.web_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 初始化视图组件
        ip_txt = view.findViewById(R.id.ip_txt);
        qr_code = view.findViewById(R.id.qr_code);

        // 只有当服务器实例不存在时才初始化和启动
        if (webServer == null) {
            // 初始化 WebServer
            webServer = new WebServer(getActivity(), 8080);
            webServer.setListener(new WebServer.WebServerListener() {
                @Override
                public void onServerStarted(String url) {
                    // 确保在主线程更新UI
                    if (isAdded()) {
                        DisplayQRCode.generateAndDisplayQRCode(url, qr_code);
                        ip_txt.setText(url);
                    }
                }

                @Override
                public void onServerStopped() {
                    if (isAdded()) {
                        ip_txt.setText("服务已关闭");
                    }
                }

                @Override
                public void onServerError(Exception e) {
                    if (isAdded()) {
                        ip_txt.setText("服务错误:" + e.getMessage());
                    }
                }

                @Override
                public void onWebDataReceived(String data) {
                    if (isAdded()) {
                        Toast.makeText(getActivity(), "收到数据:" + data, Toast.LENGTH_SHORT).show();
                        Log.e("访问","***********************************");
                        getUserId(data);
                    }
                }

                @Override
                public void onUserSaved(String userId) {
                    if (isAdded()) {
                        // 获取当前要添加的数据
                        UserInfoBen newResponse = viewModel.resultUserInfoData.getValue().data;
                        if (newResponse == null) {
                            // 如果新数据为空，则直接返回
                            return;
                        }

                        // 获取ViewModel中的当前数据列表
                        ArrayList<UserInfoBen> array = viewModel.liveData.getValue();
                        if (array == null) {
                            array = new ArrayList<>();
                        }

                        // 检查用户是否已存在
                        boolean userExists = false;
                        for (UserInfoBen response : array) {
                            if (response.getData().getUser().getSec_uid().equals(newResponse.getData().getUser().getSec_uid())) {
                                userExists = true;
                                break; // 找到后立即跳出循环
                            }
                        }

                        // 如果用户不存在，则添加新数据并更新 ViewModel
                        if (!userExists) {
                            array.add(newResponse);
                            viewModel.liveData.setValue(array);
                        }
                    }
                }
            });
            webServer.startServer();
        }
    }

    /**
     * 获取房间id
     *
     * @param roomStr 复制的房间信息
     */
    private void getUserId(String roomStr) {
        viewModel.getUserId(roomStr);
    }

    private void getUserInfo(String str) {
        viewModel.getUserInfo(str);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // 在 Fragment 视图被销毁时停止服务器
        if (webServer != null) {
            webServer.stopServer();
            webServer = null; // 释放实例
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // 再次确保在 Fragment 完全销毁时停止服务器（防止 onDestroyView 未被调用）
        if (webServer != null) {
            webServer.stopServer();
            webServer = null;
        }
    }

    public void sendMockUserData(WebServer webServer,UserInfoBen userInfoBen) {
        if (userInfoBen.getData().getUser().getLive_status()!=1){
            handleLiveStreamError(webServer,"未开播");
            return;
        }
        try {
            JSONObject mockData = new JSONObject();
            JSONArray userArray = new JSONArray();

            JSONObject user1 = new JSONObject();
            user1.put("avatar",userInfoBen.getData().getUser().getAvatar_larger().getUrl_list().get(0));
            user1.put("nickname", userInfoBen.getData().getUser().getNickname());
            user1.put("user", userInfoBen.getData().getUser().getSec_uid());
            userArray.put(user1);
            mockData.put("data", userArray);
            System.out.println("Mock JSON Data: " + mockData.toString());
            webServer.pushDataToWeb(mockData);

        } catch (Exception e) {
            e.printStackTrace();
            handleLiveStreamError(webServer,"未开播");
        }
    }

    private void getData(){
        viewModel.resultUserIdData.observe(getViewLifecycleOwner(), new ApiObserver<>() {
            @Override
            public void onSuccess(UserIdBen data, int code) {
                Log.e("访问","===============================");
                getUserInfo(data.getData());
            }

            @Override
            public void onError(int code, String message, Throwable error) {
                handleLiveStreamError(webServer,message);
            }
        });
        viewModel.resultUserInfoData.observe(getViewLifecycleOwner(), new ApiObserver<UserInfoBen>() {
            @Override
            public void onSuccess(UserInfoBen data, int code) {
                Log.e("访问","++++++++++++++++++++++++++++++");
                sendMockUserData(webServer,data);
            }

            @Override
            public void onError(int code, String message, Throwable error) {
                handleLiveStreamError(webServer,message);
            }
        });
    }

    // 在你的 Android 端代码中，当发生错误时
// 假设你有一个方法来处理异常
    public void handleLiveStreamError(WebServer webServer,String errorMessage) {
        try {
            JSONObject errorJson = new JSONObject();
            errorJson.put("status", "error");
            errorJson.put("message", errorMessage);

            // 调用你的数据推送方法，传递失败信息
            webServer.pushDataToWeb(errorJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}