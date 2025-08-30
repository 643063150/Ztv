package com.zpp.ztv.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.zpp.ztv.HttpUtils.ApiResponse;
import com.zpp.ztv.HttpUtils.Entity.AiResult;
import com.zpp.ztv.HttpUtils.Entity.DouyinLiveResponse;
import com.zpp.ztv.HttpUtils.Entity.RoomBen;
import com.zpp.ztv.HttpUtils.Entity.UserIdBen;
import com.zpp.ztv.HttpUtils.Entity.UserInfoBen;
import com.zpp.ztv.HttpUtils.MyBody.ChatRequest;
import com.zpp.ztv.HttpUtils.OllamaApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WebViewModel extends ViewModel {
    private final OllamaApi api;

    public final MutableLiveData<ApiResponse<UserIdBen>> resultUserIdData = new MutableLiveData<>();

    public final MutableLiveData<ApiResponse<UserInfoBen>> resultUserInfoData = new MutableLiveData<>();

    public final MutableLiveData<ArrayList<UserInfoBen>> liveData = new MutableLiveData<>();

    public WebViewModel(OllamaApi api) {
        this.api = api;
    }

    public void getUserId(String userStr) {
        api.getUserId(userStr).enqueue(new Callback<UserIdBen>() {
            @Override
            public void onResponse(Call<UserIdBen> call, Response<UserIdBen> response) {
                if (response.isSuccessful() && response.body() != null) {
                    resultUserIdData.postValue(ApiResponse.success(response.body(), response.code()));
                } else {
                    resultUserIdData.postValue(ApiResponse.error(
                            response.code(),
                            response.message(),
                            new IOException("HTTP Error " + response.code() + ": " + response.message())
                    ));
                }
            }

            @Override
            public void onFailure(Call<UserIdBen> call, Throwable t) {
                resultUserIdData.postValue(ApiResponse.error(-1, t.getMessage(), t));
            }
        });
    }

    public void getUserInfo(String userId) {
        api.getUserInfo(userId).enqueue(new Callback<UserInfoBen>() {
            @Override
            public void onResponse(Call<UserInfoBen> call, Response<UserInfoBen> response) {
                if (response.isSuccessful() && response.body() != null) {
                    resultUserInfoData.postValue(ApiResponse.success(response.body(), response.code()));
                } else {
                    resultUserInfoData.postValue(ApiResponse.error(
                            response.code(),
                            response.message(),
                            new IOException("HTTP Error " + response.code() + ": " + response.message())
                    ));
                }
            }

            @Override
            public void onFailure(Call<UserInfoBen> call, Throwable t) {
                resultUserInfoData.postValue(ApiResponse.error(-1, t.getMessage(), t));
            }
        });
    }
}
