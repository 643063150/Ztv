package com.zpp.ztv;

import android.app.Application;

import com.tencent.mmkv.MMKV;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化MMKV
        MMKV.initialize(this);
    }
}
