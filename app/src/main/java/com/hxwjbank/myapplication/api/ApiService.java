package com.hxwjbank.myapplication.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by wangshuai on 2017/3/21 0021.
 */

public interface ApiService {

    @GET()
    Call<String> get(@Url String url, @QueryMap Map<String, String> params);

    @POST()
    Call<String> post(@Url String url, @FieldMap Map<String, String> params);
}
