package com.zpp.ztv;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.leanback.tab.LeanbackTabLayout;
import androidx.leanback.tab.LeanbackViewPager;
import androidx.viewpager.widget.ViewPager;

import com.zpp.ztv.Fragment.SettingFragment;
import com.zpp.ztv.Fragment.TvAnchorFragment;
import com.zpp.ztv.Fragment.WebFragmment;

public class MainActivity2 extends AppCompatActivity {

    private LeanbackTabLayout tabLayout;
    private LeanbackViewPager viewPager;

    TvAnchorFragment tvAnchorFragment;
    SettingFragment settingFragment;
    WebFragmment webFragmment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tv_tab_layout);
        viewPager = findViewById(R.id.tv_view_pager);
        viewPager.setOffscreenPageLimit(3);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        // 添加Tab选择监听器，确保焦点正确传递
        tabLayout.addOnTabSelectedListener(new LeanbackTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(LeanbackTabLayout.Tab tab) {
                // 当Tab被选中时，确保ViewPager切换到对应页面
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(LeanbackTabLayout.Tab tab) {
                // 不需要特殊处理
            }

            @Override
            public void onTabReselected(LeanbackTabLayout.Tab tab) {
                // 不需要特殊处理
            }
        });

        // 设置ViewPager页面改变监听器
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // 不需要特殊处理
            }

            @Override
            public void onPageSelected(int position) {
                // 当页面改变时，确保Tab被选中
                LeanbackTabLayout.Tab tab = tabLayout.getTabAt(position);
                if (tab != null) {
                    tab.select();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // 不需要特殊处理
            }
        });

        // 设置初始焦点到TabLayout
        tabLayout.post(() -> {
            View firstTab = tabLayout.getChildAt(0);
            if (firstTab != null) {
                firstTab.requestFocus();
            }
        });
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    if (tvAnchorFragment == null) {
                        tvAnchorFragment = TvAnchorFragment.instance();
                    }
                    return tvAnchorFragment;
                case 1:
                    if (settingFragment == null) {
                        settingFragment = SettingFragment.getInstance();
                    }
                    return settingFragment;
                case 2:
                    if (webFragmment == null) {
                        webFragmment = WebFragmment.getInstance();
                    }
                    return webFragmment;
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "主播";
                case 1:
                    return "设置";
                case 2:
                    return "网页导入";
            }
            return null;
        }
    }

    // 用来计算返回键的点击间隔时间
    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                //弹出提示，可以有多种方式
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}