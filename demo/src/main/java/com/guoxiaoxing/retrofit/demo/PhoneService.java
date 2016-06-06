package com.guoxiaoxing.retrofit.demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by guoxiaoxing on 16/6/6.
 */

public interface PhoneService {
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<Phone> getPhoneLocation(@Header("apiKey") String apiKey, @Query("phone") String phone);
}
