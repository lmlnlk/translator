package com.example.translater;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("api/v1.5/tr.json/translate")
    Call<Object> translate(@FieldMap Map<String, String> map);

}
