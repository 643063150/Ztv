package com.zpp.ztv.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tencent.mmkv.MMKV;
import com.zpp.ztv.Fragment.SettingFragment;
import com.zpp.ztv.R;

import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolder> {

    private final List<SettingFragment.SettingItem> items;
    private final MMKV mmkv;

    public SettingsAdapter(List<SettingFragment.SettingItem> items) {
        this.items = items;
        this.mmkv = MMKV.defaultMMKV();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_setting, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SettingFragment.SettingItem item = items.get(position);
        holder.title.setText(item.title);
        holder.summary.setText(item.getCurrentOption());

        // Netflix 风格焦点动画 + 文字颜色变化
        holder.itemView.setOnFocusChangeListener((v, hasFocus) -> {
            float scale = hasFocus ? 1.05f : 1f; // 减小缩放比例确保不超出屏幕

            // 缩放整个item而不仅仅是文字
            v.animate().scaleX(scale).scaleY(scale).setDuration(200).start();

            // 文字颜色变化
            int titleColor = hasFocus ? R.color.colorAccent : R.color.white;
            int summaryColor = hasFocus ? R.color.colorAccentLight : R.color.gray;
            holder.title.setTextColor(v.getResources().getColor(titleColor));
            holder.summary.setTextColor(v.getResources().getColor(summaryColor));

            // 确保文字不会因缩放而被截断
            if (hasFocus) {
                holder.title.setSelected(true);
                holder.summary.setSelected(true);
            } else {
                holder.title.setSelected(false);
                holder.summary.setSelected(false);
            }
        });

        holder.itemView.setOnClickListener(v -> {
            switch(item.type){
                case SWITCH:
                case LIST:
                    item.nextOption();
                    holder.summary.setText(item.getCurrentOption());
                    savePreference(item);
                    break;
                case ACTION:
                    // TODO: 执行动作，比如清空缓存
                    break;
            }
        });
    }

    private void savePreference(SettingFragment.SettingItem item){
        switch(item.title){
            case "视频清晰度": mmkv.encode("video_quality", item.currentIndex); break;
            case "硬件加速": mmkv.encode("hardware_acceleration", item.currentIndex); break;
            case "播放速度": mmkv.encode("playback_speed", item.currentIndex); break;
            case "字幕显示": mmkv.encode("subtitle_toggle", item.currentIndex); break;
        }
    }

    @Override
    public int getItemCount() { return items.size(); }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, summary;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
            summary = itemView.findViewById(R.id.item_summary);

            // 初始设置
            itemView.setScaleX(1f);
            itemView.setScaleY(1f);
        }
    }
}