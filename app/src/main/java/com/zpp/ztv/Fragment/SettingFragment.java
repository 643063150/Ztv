package com.zpp.ztv.Fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tencent.mmkv.MMKV;
import com.zpp.ztv.Adapter.SettingsAdapter;
import com.zpp.ztv.R;

import java.util.ArrayList;
import java.util.List;

public class SettingFragment extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private MMKV mmkv;

    private List<SettingItem> items;
    public static SettingFragment getInstance(){
        return new SettingFragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.setting_fragment_layout,container,false);
        mmkv = MMKV.defaultMMKV(); // 已在Application中初始化，无需重复初始化
        recyclerView = view.findViewById(R.id.settings_recycler);
        initSettings();
        setAdapter();
        return view;
    }

    private void setAdapter(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SettingsAdapter(items));
        int spacing = 24; // dp
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                                       @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.bottom = spacing; // 控制垂直间隔
            }
        });

    }

    private void initSettings() {
        items = new ArrayList<>();
        items.add(new SettingItem("视频清晰度", new String[]{"自动","标清","高清","超清","蓝光"},
                mmkv.decodeInt("video_quality", 0), SettingType.LIST));
        items.add(new SettingItem("硬件加速", new String[]{"已关闭","已开启"},
                mmkv.decodeInt("hardware_acceleration", 1), SettingType.SWITCH));
        items.add(new SettingItem("播放速度", new String[]{"0.5x","0.75x","1x","1.25x","1.5x","2x"},
                mmkv.decodeInt("playback_speed", 2), SettingType.LIST));
        items.add(new SettingItem("字幕显示", new String[]{"已关闭","已开启"},
                mmkv.decodeInt("subtitle_toggle", 1), SettingType.SWITCH));
        items.add(new SettingItem("清空缓存", new String[]{""}, 0, SettingType.ACTION));
    }

    public static class SettingItem {
        public String title;
        public String[] options;
        public int currentIndex;
        public SettingType type;

        public SettingItem(String title, String[] options, int currentIndex, SettingType type) {
            this.title = title;
            this.options = options;
            this.currentIndex = currentIndex;
            this.type = type;
        }

        public String getCurrentOption() {
            return options[currentIndex];
        }

        public void nextOption() {
            if(type == SettingType.SWITCH || type == SettingType.LIST) {
                currentIndex = (currentIndex + 1) % options.length;
            }
        }
    }

    public static enum SettingType {SWITCH, LIST, ACTION}

}
