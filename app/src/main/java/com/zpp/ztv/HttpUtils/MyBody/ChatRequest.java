package com.zpp.ztv.HttpUtils.MyBody;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ollama API 的请求模型
 */
public class ChatRequest {

    @SerializedName("model")
    private String model;

    @SerializedName("messages")
    private List<Message> messages;

    @SerializedName("stream")
    private boolean stream = false; // 通常将 stream 设置为 false，除非你需要流式传输

    public ChatRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    // 内部类，表示消息体
    public static class Message {
        @SerializedName("role")
        private String role;
        @SerializedName("content")
        private String content;

        public Message(String role, String content) {
            this.role = role;
            this.content = content;
        }
    }
}
