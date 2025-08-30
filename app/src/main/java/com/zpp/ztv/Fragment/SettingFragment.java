package com.zpp.ztv.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zpp.ztv.R;

public class SettingFragment extends Fragment {
    View view;
    public static SettingFragment getInstance(){
        return new SettingFragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.setting_fragment_layout,container,false);
        return view;
    }
}
