package com.adis.tanamkuy.API;

import com.adis.tanamkuy.Model.KebunModel;


import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService{

    //read
    @GET("9yekl")
    Call<KebunModel> getPegiMakan();

}