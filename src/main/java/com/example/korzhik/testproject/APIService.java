package com.example.korzhik.testproject;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    String HOST = "http://game.mifoza.com";

    @GET("tasks/get.php")
    Call<List<QuestCard>> getQuestCard();

    @GET("tasks/logic/accept.php")
    Call<ResponseBody> acceptTask(@Query("id") int id);

    @GET("tasks/logic/pass.php")
    Call<ResponseBody> passTask(@Query("token") String token);
}
