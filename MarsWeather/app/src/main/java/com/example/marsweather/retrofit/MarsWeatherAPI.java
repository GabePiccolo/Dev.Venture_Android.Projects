package com.example.marsweather.retrofit;

import com.example.marsweather.model.WeatherStatus;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface MarsWeatherAPI {

    @GET("latest")
    Observable<WeatherStatus> getLatestWeather();
}
