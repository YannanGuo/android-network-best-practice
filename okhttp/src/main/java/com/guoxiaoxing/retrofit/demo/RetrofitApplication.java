package com.guoxiaoxing.retrofit.demo;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApplication extends Application {

    public static final String API_KEY = "23be4be008e230689f5c7a95f9a5fc9e";
    private static final String BASE_UEL = "http://apis.baidu.com";
    private static Retrofit mRetrofit;

    public static Retrofit getRetrofit() {
        return mRetrofit;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_UEL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
