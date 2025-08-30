package com.zpp.ztv.HttpUtils;



import com.zpp.ztv.HttpUtils.Entity.AiResult;
import com.zpp.ztv.HttpUtils.Entity.DouyinLiveResponse;
import com.zpp.ztv.HttpUtils.Entity.RoomBen;
import com.zpp.ztv.HttpUtils.Entity.UserIdBen;
import com.zpp.ztv.HttpUtils.Entity.UserInfoBen;
import com.zpp.ztv.HttpUtils.MyBody.ChatRequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryName;

/**
 * ollama API 的接口定义
 */
public interface OllamaApi {

    @POST("api/chat")  // 这里是 Ollama API 的示例路径，根据你的服务端调整
    Call<AiResult> sendMessage(@Body ChatRequest body);

    @POST("api/douyin/web/get_all_webcast_id")
    Call<RoomBen> getRoomId(@Body List<String> roomUrls);

    @GET("api/douyin/web/fetch_user_live_videos")
    Call<DouyinLiveResponse> getLiveRoom(@Query("webcast_id") String room_id);

    @GET("/api/douyin/web/get_sec_user_id")
    Call<UserIdBen>getUserId(@Query("url")String url);

    @GET("api/douyin/web/handler_user_profile")
    Call<UserInfoBen>getUserInfo(@Query("sec_user_id")String sec_user_id);


}
