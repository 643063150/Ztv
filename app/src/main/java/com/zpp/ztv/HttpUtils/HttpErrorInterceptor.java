package com.zpp.ztv.HttpUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 拦截器，用于处理网络请求和响应
 */
public class HttpErrorInterceptor implements Interceptor {

    private boolean enableLogging;

    public HttpErrorInterceptor(boolean enableLogging) {
        this.enableLogging = enableLogging;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        if (enableLogging) {
            System.out.println("=== HTTP REQUEST ===");
            System.out.println(request.method() + " " + request.url());
            if (request.body() != null) {
                okio.Buffer buffer = new okio.Buffer();
                request.body().writeTo(buffer);
                System.out.println(buffer.readUtf8());
            }
            System.out.println("===================");
        }

        try {
            Response response = chain.proceed(request);

            if (enableLogging) {
                System.out.println("=== HTTP RESPONSE ===");
                System.out.println("Code: " + response.code());
                if (response.body() != null) {
                    String respBody = response.peekBody(Long.MAX_VALUE).string();
                    System.out.println(respBody);
                }
                System.out.println("====================");
            }

            if (!response.isSuccessful()) {
                throw new IOException("HTTP Error " + response.code() + ": " + response.message());
            }
            return response;
        } catch (IOException e) {
            if (enableLogging) {
                System.out.println("=== NETWORK ERROR ===");
                e.printStackTrace();
                System.out.println("====================");
            }
            throw e;
        }
    }
}
