package com.example.desafiodevventure.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private static Retrofit config;
    private static final String baseurl = "https://api.imgur.com/3/gallery/search/";

    public static Retrofit RetrofitConfig() {
        config = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return config;
    }
    public CatsAPI getCatsAPI(){
        return config.create(CatsAPI.class);
    }
}
