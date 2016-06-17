package com.guoxiaoxing.retrofit.demo.service;

import com.guoxiaoxing.retrofit.demo.model.PhoneLocation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by guoxiaoxing on 16/6/6.
 */

public interface PhoneLocationService {
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<PhoneLocation> getResult(@Header("apiKey") String apiKey, @Query("phone") String phone);
}