package com.zpp.ztv.HttpUtils.Entity;

import com.google.gson.annotations.SerializedName;

/**
 * ollama API 的响应模型
 */
public class AiResult {

    /**
     * 表示此次响应使用的模型名称，例如 "llama3"。
     */
    @SerializedName("model")
    private String model;

    /**
     * 表示响应创建的时间，格式为 ISO 8601。
     */
    @SerializedName("created_at")
    private String createdAt;

    /**
     * 包含 AI 生成的实际消息内容，是一个 Message 对象。
     */
    @SerializedName("message")
    private Message message;

    /**
     * 表示响应是否已经完成。如果为 true，则表示这是最后一个响应分块（用于流式传输）。
     * 在非流式传输中，这个值通常为 true。
     */
    @SerializedName("done")
    private boolean done;

    /**
     * 内部类，代表响应中的具体消息。
     */
    public static class Message {
        /**
         * 消息发送者的角色，例如 "assistant"。
         */
        @SerializedName("role")
        private String role;

        /**
         * 消息的具体内容，即 AI 生成的文本。
         */
        @SerializedName("content")
        private String content;

        // Getters and Setters
        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    // Getters and Setters for AiResult
    public String getModel() {
        return model;
    }

    public Message getMessage() {
        return message;
    }
}