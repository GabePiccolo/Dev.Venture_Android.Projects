package com.example.desafiodevventure.retrofit;

import com.example.desafiodevventure.model.Cats;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CatsAPI {

    @GET("https://api.imgur.com/3/gallery/search/")
    Observable<Cats> getCatsPhoto(@Query("cats") String cats);
}
