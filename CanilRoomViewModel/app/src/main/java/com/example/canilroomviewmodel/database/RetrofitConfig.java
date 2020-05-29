package com.example.canilroomviewmodel.database;

import com.example.canilroomviewmodel.model.Canil;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit config;
    private String baseUrl = "https://api.thedogapi.com/v1/breeds/";

    public RetrofitConfig() {
        config = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public CanilAPI getCanilAPI(){return config.create(CanilAPI.class);}
}
