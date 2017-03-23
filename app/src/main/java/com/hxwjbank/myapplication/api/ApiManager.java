package com.hxwjbank.myapplication.api;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by wangshuai on 2017/3/21 0021.
 */

public class ApiManager {

    private static final int    READ_TIME_OUT    = 3;
    private static final int    CONNECT_TIME_OUT = 3;
    private static final String BASE_URL         = "http://www.oschina.net/action/apiv2/";

    private ApiService mApiService;
    private Gson mGson;

    private ApiManager() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT);//打印retrofit日志
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                //.addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        mApiService = retrofit.create(ApiService.class);
        mGson = new Gson();
    }

    private static ApiManager sApiManager = null;

    public static ApiManager getInstance() {
        if (sApiManager == null) {
            synchronized (ApiManager.class) {
                if (sApiManager == null) {
                    return new ApiManager();
                }
            }
        }
        return sApiManager;
    }

    public enum RequestType {GET, POST}

    public void call(String url, Map<String, String> params, RequestType requestType, final BaseCallBack baseCallBack) {
        Call<String> call;
        if (requestType == RequestType.GET) {
            call = mApiService.get(url, params);
        } else {
            call = mApiService.post(url, params);
        }
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    String json = response.body();
                    System.out.println(json);
                    if (baseCallBack.mType == String.class) {
                        baseCallBack.onSuccess(response,json);
                    } else {
                        try {
                            doSuccess(json,baseCallBack,response);
                        } catch (JsonParseException e) {
                            baseCallBack.onError(response, response.code(), e);
                        }
                    }
                } else {
                    baseCallBack.onError(response, response.code(), null);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                baseCallBack.onFailure(call, t);
            }
        });
    }


    private void doSuccess(String json, BaseCallBack baseCallBack, Response<String> response) {
        Object o = mGson.fromJson(json, baseCallBack.mType);
        baseCallBack.onSuccess(response, o);
    }

}
