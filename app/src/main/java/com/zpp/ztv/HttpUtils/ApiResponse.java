package com.zpp.ztv.HttpUtils;

/**
 * 拦截器 的响应模型
 * @param <T>
 */
public class ApiResponse<T> {
    public boolean success;
    public T data;
    public int code;           // HTTP 状态码，-1 表示网络异常
    public String message;     // 错误信息
    public Throwable error;    // 网络异常或 HTTP 错误封装

    public static <T> ApiResponse<T> success(T data, int code) {
        ApiResponse<T> resp = new ApiResponse<>();
        resp.success = true;
        resp.data = data;
        resp.code = code;
        resp.message = "OK";
        resp.error = null;
        return resp;
    }

    public static <T> ApiResponse<T> error(int code, String message, Throwable error) {
        ApiResponse<T> resp = new ApiResponse<>();
        resp.success = false;
        resp.code = code;
        resp.message = message;
        resp.error = error;
        return resp;
    }
}

