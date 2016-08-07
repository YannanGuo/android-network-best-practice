package com.guoxiaoxing.retrofit;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author: guoxiaoxing
 * Email: guoxiaoxingv@163.com
 * Site: https://github.com/guoxiaoxing
 * Date: 16/6/7 下午4:44
 * Function: 创建Service
 * <p>
 * Modification history:
 * Date                 Author              Version             Description
 * --------------------------------------------------------------------------
 * 16/6/7 下午4:44      guoxiaoxing          1.0
 */
public class RetrofitPlus {

    private String API_BASE_URL;

    private static Retrofit mRetrofit;

    OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

    private Retrofit getInstance() {
        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static <T> T createService(Class<T> serviceClass) {
        return mRetrofit.create(serviceClass);
    }
}
