package com.zpp.ztv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.shuyu.gsyvideoplayer.player.PlayerFactory;
import com.shuyu.gsyvideoplayer.player.SystemPlayerManager;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import tv.danmaku.ijk.media.exo2.Exo2PlayerManager;


public class FullscreenNoUiVideo extends StandardGSYVideoPlayer {

    private boolean isPaused = false;

    public enum Core { EXO2, IJK, SYSTEM }
    public enum Render { TEXTURE, SURFACE, GL }
    public enum Show { DEFAULT, FULL, MATCH_FULL, SIXTEEN_NINE, FOUR_THREE }

    public FullscreenNoUiVideo(Context context) {
        super(context);
        initNoUi();
    }

    public FullscreenNoUiVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
        initNoUi();
    }

    private void initNoUi() {
        if (mTopContainer != null) mTopContainer.setVisibility(View.GONE);
        if (mBottomContainer != null) mBottomContainer.setVisibility(View.GONE);
        if (mStartButton != null) mStartButton.setVisibility(View.GONE);
        if (mFullscreenButton != null) mFullscreenButton.setVisibility(View.GONE);
        if (mProgressBar != null) mProgressBar.setVisibility(View.GONE);
        if (mCurrentTimeTextView != null) mCurrentTimeTextView.setVisibility(View.GONE);
        if (mTotalTimeTextView != null) mTotalTimeTextView.setVisibility(View.GONE);
        setIsTouchWiget(false);    // 关闭手势
        setIfCurrentIsFullscreen(true); // 默认就是全屏
        setNeedShowWifiTip(false);
    }

    @Override
    public int getLayoutId() {
        return R.layout.view_fullscreen_no_ui_video;
    }


    @Override
    protected void updateStartImage() { }

    // 内核切换
    public void setPlayerCore(Core core) {
        switch (core) {
            case EXO2:
                PlayerFactory.setPlayManager(Exo2PlayerManager.class);
                break;
            case IJK:
                PlayerFactory.setPlayManager(IjkPlayerManager.class);
                break;
            case SYSTEM:
                PlayerFactory.setPlayManager(SystemPlayerManager.class);
                break;
        }
    }

    // 渲染模式切换
    public void setRender(Render render) {
        switch (render) {
            case TEXTURE: GSYVideoType.setRenderType(GSYVideoType.TEXTURE); break;
            case SURFACE: GSYVideoType.setRenderType(GSYVideoType.SUFRACE); break;
            case GL: GSYVideoType.setRenderType(GSYVideoType.GLSURFACE); break;
        }
        requestLayout();
    }

    // 比例切换
    public void setShowType(Show show) {
        switch (show) {
            case DEFAULT: GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_DEFAULT); break;
            case FULL: GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_FULL); break;
            case MATCH_FULL: GSYVideoType.setShowType(GSYVideoType.SCREEN_MATCH_FULL); break;
            case SIXTEEN_NINE: GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_16_9); break;
            case FOUR_THREE: GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_4_3); break;
        }
        changeTextureViewShowType();
        if (mTextureView != null)
            mTextureView.requestLayout();

    }


    public void setPlayerCallback(GSYSampleCallBack callback) {
        setVideoAllCallBack(callback);
    }

    /**
     * 修复暂停后无法恢复播放的问题
     */
    public void toggleCenterPlayPause() {
        if (mIfCurrentIsFullscreen) {
            if (isInPlayingState()) {
                if (isPaused) {
                    // 恢复播放
                    onVideoResume();
                    isPaused = false;
                } else {
                    // 暂停播放
                    onVideoPause();
                    isPaused = true;
                }
            }
        }
    }
}
