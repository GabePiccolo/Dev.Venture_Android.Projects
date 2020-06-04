package com.example.desafiodevventure.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private final Retrofit config;
    private String baseurl = "https://api.imgur.com/3/gallery/search/";

    public RetrofitConfig(Retrofit config) {
        this.config = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public CatsAPI getCatsAPI(){
        return config.create(CatsAPI.class);
    }
}
