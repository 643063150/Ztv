package com.zpp.ztv.HttpUtils;

import androidx.lifecycle.Observer;

/**
 * ollama API 的响应模型
 * @param <T>
 */
public abstract class ApiObserver<T> implements Observer<ApiResponse<T>> {
    @Override
    public void onChanged(ApiResponse<T> resp) {
        if (resp == null) return;
        if (resp.success) {
            onSuccess(resp.data, resp.code);
        } else {
            onError(resp.code, resp.message, resp.error);
        }
    }

    public abstract void onSuccess(T data, int code);

    public abstract void onError(int code, String message, Throwable error);
}

