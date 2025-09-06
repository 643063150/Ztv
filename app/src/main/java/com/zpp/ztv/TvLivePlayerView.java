package com.zpp.ztv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;


import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class TvLivePlayerView extends FrameLayout {
    private static final String TAG = "TvLivePlayerView";

    // 替换为自定义的全屏无 UI 播放器
    private FullscreenNoUiVideo playerView;
    private OrientationUtils orientationUtils;

    private float[] speeds = {0.5f, 1f, 1.5f, 2f};
    private int currentSpeedIndex = 1;

    private View menuView;
    private boolean isMenuShowing = false;

    // 线路相关变量
    private List<String> lineList = new ArrayList<>();
    private int currentLineIndex = 0;
    private TextView lineBtn;

    // 比例模式相关
    private int[] scales = {
            GSYVideoType.SCREEN_TYPE_DEFAULT, // 适应
            GSYVideoType.SCREEN_MATCH_FULL,   // 填充
            GSYVideoType.SCREEN_TYPE_FULL,    // 裁剪
            GSYVideoType.SCREEN_TYPE_16_9,    // 16:9
            GSYVideoType.SCREEN_TYPE_4_3,     // 4:3
    };
    private String[] scaleNames = {"适应", "填充", "裁剪", "16:9", "4:3"};
    private int currentScaleIndex = 0;

    // 网速相关
    private TextView networkSpeedTv;
    private Handler handler;
    private Runnable updateSpeedRunnable;
    private boolean isNetworkSpeedVisible = false;

    // 用于防止焦点被抢
    private boolean isPlayerUiHidden = false;

    public TvLivePlayerView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public TvLivePlayerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TvLivePlayerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        // 使用你的布局（确保布局中的 player_view 类型是 com.zpp.ztv.FullscreenNoUiVideo）
        LayoutInflater.from(context).inflate(R.layout.view_tv_live_player, this, true);
        playerView = findViewById(R.id.player_view);
        networkSpeedTv = findViewById(R.id.network_speed_tv);

        // 隐藏播放器默认 UI（FullScreenNoUiVideo 本身也会隐藏，但这里双重保证）
        hideDefaultUI();

        // 基本配置
        playerView.setUp("", false, "");
        playerView.setReleaseWhenLossAudio(true);
        playerView.setVideoAllCallBack(null);

        // 默认添加一个空线路，便于菜单生成
        lineList.add("");

        // 自定义控件获取焦点（外层 TvLivePlayerView 获取焦点，避免播放器内部夺取）
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();

        // 初始化网速更新
        handler = new Handler(Looper.getMainLooper());
        updateSpeedRunnable = new Runnable() {
            @Override
            public void run() {
                if (isNetworkSpeedVisible && playerView.isInPlayingState()) {
                    long currentSpeed = GSYVideoManager.instance().getNetSpeed();
                    updateNetworkSpeed(currentSpeed);
                } else if (isNetworkSpeedVisible) {
                    networkSpeedTv.setText("检测中...");
                }
                handler.postDelayed(this, 1000);
            }
        };

        showNetworkSpeed(false);
    }

    /**
     * 隐藏GSYVideoPlayer的所有默认UI元素
     */
    private void hideDefaultUI() {
        if (isPlayerUiHidden) return;

        try {
            // 尝试隐藏一些常见的控件（如果 FullscreenNoUiVideo 已经隐藏则无影响）
            playerView.getTitleTextView().setVisibility(View.GONE);
            playerView.getBackButton().setVisibility(View.GONE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        playerView.setNeedShowWifiTip(false);
        playerView.setHideKey(true);
        playerView.setShowPauseCover(false);

        playerView.setFocusable(false);
        playerView.setFocusableInTouchMode(false);

        isPlayerUiHidden = true;
    }

    /**
     * 备用：修改渲染视图显示类型（不再作为菜单主路径，菜单会直接调用 setShowType）
     */
    private void changeTextureViewShowType() {
        try {
            Field textureViewField = playerView.getClass().getDeclaredField("mTextureView");
            textureViewField.setAccessible(true);
            Object textureViewObj = textureViewField.get(playerView);

            if (textureViewObj != null && textureViewObj instanceof android.view.View) {
                GSYVideoType.setShowType(scales[currentScaleIndex]);
                ((android.view.View) textureViewObj).requestLayout();
            }
        } catch (Exception e) {
            e.printStackTrace();
            GSYVideoType.setShowType(scales[currentScaleIndex]);
        }
    }

    /**
     * 允许外部设置监听（保持兼容）
     */
    public void setPlayerStateListener(GSYMediaPlayerListener listener) {
        // 你可以把 listener 映射到 playerView 的回调，或保留原有的处理方式
    }

    /**
     * 播放 URL
     */
    public void play(String url) {
        playerView.setUp(url, true, "");
        playerView.startPlayLogic();
        if (isNetworkSpeedVisible) {
            handler.post(updateSpeedRunnable);
        }
    }

    public void setLineList(List<String> lineUrls) {
        if (lineUrls != null && !lineUrls.isEmpty()) {
            this.lineList = lineUrls;
            this.currentLineIndex = 0;

            if (playerView.isInPlayingState() || playerView.getCurrentState() == StandardGSYVideoPlayer.CURRENT_STATE_PAUSE) {
                play(lineList.get(currentLineIndex));
            }
        }
    }

    public void switchToLine(int index) {
        if (index >= 0 && index < lineList.size()) {
            this.currentLineIndex = index;
            boolean wasPlaying = playerView.isInPlayingState();

            if (wasPlaying) {
                playerView.onVideoPause();
            }

            play(lineList.get(currentLineIndex));

            if (wasPlaying) {
                playerView.onVideoResume();
            }

            if (lineBtn != null) {
                lineBtn.setText("线路 " + (currentLineIndex + 1));
            }
        }
    }

    /**
     * 切换播放器内核 — 改为调用 FullscreenNoUiVideo 的方法
     * 0: ExoPlayer, 1: IjkPlayer, 2: MediaPlayer(系统)
     */
    public void switchPlayerCore(int coreType) {
        // 保留你原来的暂停/恢复策略
        if (playerView.isInPlayingState()) {
            playerView.onVideoPause();
        }

        switch (coreType) {
            case 0:
                playerView.setPlayerCore(FullscreenNoUiVideo.Core.EXO2);
                break;
            case 1:
                playerView.setPlayerCore(FullscreenNoUiVideo.Core.IJK);
                break;
            case 2:
                playerView.setPlayerCore(FullscreenNoUiVideo.Core.SYSTEM);
                break;
        }

        // 若之前处于暂停状态，尝试恢复
        if (playerView.getCurrentState() == StandardGSYVideoPlayer.CURRENT_STATE_PAUSE) {
            playerView.onVideoResume();
        }
    }

    /**
     * 切换解码类型
     * @param codecType 0: 硬解码, 1: 软解码
     */
    public void setMediaCodec(int codecType) {
        switch (codecType){
            case 0:
                GSYVideoType.enableMediaCodec();
                GSYVideoType.enableMediaCodecTexture();
                break;
            case 1:
                GSYVideoType.disableMediaCodec();
                GSYVideoType.disableMediaCodecTexture();
                break;
        }
    }

    /**
     * 切换绘制模式（改为通过 playerView 方法）
     * 0: SurfaceView, 1: Texture/GL（取决你的 FullscreenNoUiVideo 支持）
     */
    public void switchRenderView(int renderType) {
        if (renderType == 0) {
            playerView.setRender(FullscreenNoUiVideo.Render.SURFACE);
        } else {
            playerView.setRender(FullscreenNoUiVideo.Render.TEXTURE); // 或 GL，根据需要
        }

        if (playerView.isInPlayingState() || playerView.getCurrentState() == StandardGSYVideoPlayer.CURRENT_STATE_PAUSE) {
            // 重启播放以确保渲染类型生效
            playerView.startPlayLogic();
        }
    }

    public void release() {
        if (playerView != null) {
            playerView.onVideoPause();
            playerView.release();
        }
        if (handler != null) {
            handler.removeCallbacks(updateSpeedRunnable);
        }
        GSYVideoManager.releaseAllVideos();
    }

    public void onPause() {
        if (playerView != null) {
            playerView.onVideoPause();
        }
        if (handler != null) {
            handler.removeCallbacks(updateSpeedRunnable);
        }
    }

    public void onResume() {
        if (playerView != null) {
            playerView.onVideoResume();
        }
        if (isNetworkSpeedVisible && handler != null) {
            handler.post(updateSpeedRunnable);
        }
    }

    /**
     * 是否显示网速
     * @param show 0 隐藏 1显示
     */
    public void showNetworkSpeed(boolean show) {
        this.isNetworkSpeedVisible = show;
        if (networkSpeedTv != null) {
            networkSpeedTv.setVisibility(show ? View.VISIBLE : View.GONE);
        }
        if (show) {
            handler.post(updateSpeedRunnable);
        } else {
            handler.removeCallbacks(updateSpeedRunnable);
        }
    }

    private void updateNetworkSpeed(long bytesPerSec) {
        String speedText;
        if (bytesPerSec <= 0) {
            speedText = "检测中...";
        } else if (bytesPerSec < 1000 * 1000) {
            double speedKBps = bytesPerSec / 1024.0;
            speedText = String.format(Locale.getDefault(), "%.1f KB/s", speedKBps);
        } else {
            double speedMBps = bytesPerSec / 1024.0 / 1024.0;
            speedText = String.format(Locale.getDefault(), "%.2f MB/s", speedMBps);
        }
        if (networkSpeedTv != null) {
            networkSpeedTv.setText(speedText);
        }
    }

    /**
     * 按键处理：保留你原来的按键逻辑，但把中间按键改为调用 playerView.toggleCenterPlayPause()
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 菜单显示时处理菜单内的按键
        if (isMenuShowing) {
            return handleMenuKey(keyCode, event);
        }

        // 菜单未显示时处理播放器按键（保持你原来的逻辑）
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
            case KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE:
                // 使用 FullscreenNoUiVideo 的 toggleCenterPlayPause() 以修复暂停后恢复问题
                playerView.toggleCenterPlayPause();
                return true;

            case KeyEvent.KEYCODE_DPAD_LEFT:
                // 继续使用 GSY 的默认快退行为（返回 false 让父类/系统处理）
                return false;

            case KeyEvent.KEYCODE_DPAD_RIGHT:
                // 继续使用 GSY 的默认快进行为
                return false;

            case KeyEvent.KEYCODE_MENU:
            case KeyEvent.KEYCODE_BOOKMARK:
            case KeyEvent.KEYCODE_INFO:
                showMenu();
                return true;

            case KeyEvent.KEYCODE_MEDIA_STOP:
                playerView.onVideoPause();
                return true;

            case KeyEvent.KEYCODE_BACK:
                if (isMenuShowing) {
                    closeMenu();
                    return true;
                }
                break;

            default:
                return super.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);
    }

    private boolean handleMenuKey(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
            case KeyEvent.KEYCODE_MENU:
                closeMenu();
                return true;

            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_DPAD_DOWN:
            case KeyEvent.KEYCODE_DPAD_LEFT:
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                // 让系统处理菜单内的导航
                return super.onKeyDown(keyCode, event);

            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
                View focusedView = findFocus();
                if (focusedView != null && focusedView.isClickable()) {
                    focusedView.performClick();
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     * 原封不动保留：showMenu（但把菜单内的比例切换 / 内核切换 替换为调用 playerView 的方法）
     */
    private void showMenu() {
        if (isMenuShowing) {
            return;
        }

        isMenuShowing = true;
        menuView = LayoutInflater.from(getContext()).inflate(R.layout.view_tv_menu, this, false);
        addView(menuView);

        TextView speedBtn = menuView.findViewById(R.id.tv_speed);
        TextView scaleBtn = menuView.findViewById(R.id.tv_scale);
        lineBtn = menuView.findViewById(R.id.tv_line);
        TextView cropBtn = menuView.findViewById(R.id.tv_crop);
        LinearLayout cropContainer = menuView.findViewById(R.id.crop_container);
        LinearLayout lineContainer = menuView.findViewById(R.id.line_container);

        lineBtn.setText("线路 " + (currentLineIndex + 1));
        speedBtn.setText("速度 " + speeds[currentSpeedIndex] + "x");
        scaleBtn.setText("比例 " + scaleNames[currentScaleIndex]);

        // 隐藏裁切相关 UI（你要求移除）
        cropBtn.setVisibility(View.GONE);
        cropContainer.setVisibility(View.GONE);

        // 倍速按钮：直接调用 playerView.setSpeed(...)
        speedBtn.setOnClickListener(v -> {
            currentSpeedIndex = (currentSpeedIndex + 1) % speeds.length;
            playerView.setSpeed(speeds[currentSpeedIndex], true);
            speedBtn.setText("速度 " + speeds[currentSpeedIndex] + "x");
        });

        // 比例切换：直接调用 playerView.setShowType(...)（使用我们 FullscreenNoUiVideo 的方法）
        scaleBtn.setOnClickListener(v -> {
            currentScaleIndex = (currentScaleIndex + 1) % scales.length;
            // map 当前索引到 FullscreenNoUiVideo.Show
            FullscreenNoUiVideo.Show showType = mapScaleIndexToShow(currentScaleIndex);
            playerView.setShowType(showType);
            scaleBtn.setText("比例 " + scaleNames[currentScaleIndex]);
        });

        // 线路选择 - 动态生成线路按钮（调用 switchToLine）
        lineContainer.removeAllViews();
        for (int i = 0; i < lineList.size(); i++) {
            TextView lineOption = new TextView(getContext());
            lineOption.setText("线路 " + (i + 1));
            lineOption.setTextSize(16);
            lineOption.setPadding(32, 16, 32, 16);
            lineOption.setFocusable(true);
            lineOption.setClickable(true);

            if (i == currentLineIndex) {
                lineOption.setTextColor(0xFFFF0000);
            }

            final int lineIndex = i;
            lineOption.setOnClickListener(v -> {
                switchToLine(lineIndex);
                for (int j = 0; j < lineContainer.getChildCount(); j++) {
                    TextView option = (TextView) lineContainer.getChildAt(j);
                    option.setTextColor(j == lineIndex ? 0xFFFF0000 : 0xFFFFFFFF);
                }
            });

            lineOption.setOnFocusChangeListener((v, hasFocus) -> {
                if (hasFocus) {
                    v.setBackgroundColor(0x66FFFFFF);
                } else {
                    v.setBackgroundColor(0x00000000);
                }
            });

            lineContainer.addView(lineOption);
        }

        // 菜单初始焦点与可焦点设置
        speedBtn.setFocusable(true);
        scaleBtn.setFocusable(true);
        lineBtn.setFocusable(true);
        speedBtn.requestFocus();

        speedBtn.setOnFocusChangeListener((v, hasFocus) -> v.setBackgroundColor(hasFocus ? 0x66FFFFFF : 0x00000000));
        scaleBtn.setOnFocusChangeListener((v, hasFocus) -> v.setBackgroundColor(hasFocus ? 0x66FFFFFF : 0x00000000));
        lineBtn.setOnFocusChangeListener((v, hasFocus) -> v.setBackgroundColor(hasFocus ? 0x66FFFFFF : 0x00000000));

        // 禁掉外层的焦点，交给菜单
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
    }

    private FullscreenNoUiVideo.Show mapScaleIndexToShow(int idx) {
        switch (idx) {
            case 0: return FullscreenNoUiVideo.Show.DEFAULT;
            case 1: return FullscreenNoUiVideo.Show.MATCH_FULL;
            case 2: return FullscreenNoUiVideo.Show.FULL;
            case 3: return FullscreenNoUiVideo.Show.SIXTEEN_NINE;
            case 4: return FullscreenNoUiVideo.Show.FOUR_THREE;
            default: return FullscreenNoUiVideo.Show.DEFAULT;
        }
    }

    private void closeMenu() {
        if (menuView != null && menuView.getParent() != null) {
            removeView(menuView);
        }
        isMenuShowing = false;
        menuView = null;
        lineBtn = null;

        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
    }
}
