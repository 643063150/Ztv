package com.zpp.ztv.HttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit 客户端
 */
public class RetrofitClient {
    private static Boolean loggingEnabled = false; // 默认不打印
    private static Retrofit retrofitInstance;

    private RetrofitClient() {} // 私有构造

    public static RetrofitClient getInstance() {
        return new RetrofitClient();
    }

    public static RetrofitClient enableLogging(boolean enable) {
        loggingEnabled = enable;
        retrofitInstance = null;
        return new RetrofitClient();
    }

    public <T> T getApi(Class<T> serviceClass) {
        return getApi(serviceClass, "https://douyin.wtf/");
    }

    public <T> T getApi(Class<T> serviceClass, String baseUrl) {
        initRetrofit(baseUrl);
        return retrofitInstance.create(serviceClass);
    }

    private void initRetrofit(String baseUrl) {
        if (retrofitInstance == null) {
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(new HttpErrorInterceptor(loggingEnabled));

            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(clientBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }
}


