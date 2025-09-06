package com.zpp.ztv;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;

import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.tencent.mmkv.MMKV;


@UnstableApi
public class PlayerActivity extends AppCompatActivity {
    private TvLivePlayerView tvPlayerView;
    private String url="";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tvPlayerView = new TvLivePlayerView(this);
        setContentView(tvPlayerView);
        initView();

    }

    public void initView(){
        url=getIntent().getStringExtra("url");
        tvPlayerView.setMediaCodec(MMKV.defaultMMKV().decodeInt("mediacodec", 1));
        tvPlayerView.switchPlayerCore(MMKV.defaultMMKV().decodeInt("player_core", 0));
        int show_net_speed=MMKV.defaultMMKV().decodeInt("show_net_speed", 0);
        if (show_net_speed==0){
            tvPlayerView.showNetworkSpeed(false);
        }else {
            tvPlayerView.showNetworkSpeed(true);
        }
        tvPlayerView.play(url);


    }
    @Override
    protected void onPause() {
        super.onPause();
        tvPlayerView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvPlayerView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tvPlayerView.release();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 将事件直接传递给你的自定义视图
        if (tvPlayerView.onKeyDown(keyCode, event)) {
            return true; // 如果视图处理了事件，就消费它
        }

        // 如果自定义视图没有处理该事件，就执行默认的 Activity 行为
        return super.onKeyDown(keyCode, event);
    }
}
