package com.example.iot_irrigation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("auth_username/{username}")
    Call<Init> setInit(@Path("username") String username);
}
