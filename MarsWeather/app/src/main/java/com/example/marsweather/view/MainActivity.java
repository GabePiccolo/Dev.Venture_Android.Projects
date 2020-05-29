package com.example.marsweather.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.marsweather.R;
import com.example.marsweather.model.WeatherStatus;
import com.example.marsweather.retrofit.RetrofitConfig;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    RetrofitConfig retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nome = "Gabe";
        retrofit = new RetrofitConfig();

        retrofit.getMarsWeatherAPI().getLatestWeather().subscribe(new Observer<WeatherStatus>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull WeatherStatus weatherStatus) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        Observable<String> observable = Observable.just(nome);

        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Toast.makeText(getApplicationContext(), "onSubscribe", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onSubscribe");
            }

            @Override
            public void onNext(@NonNull String s) {
                Toast.makeText(getApplicationContext(), "onNext", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onNext");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Toast.makeText(getApplicationContext(), "onError", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onError");
            }

            @Override
            public void onComplete() {
                Toast.makeText(getApplicationContext(), "onComplete", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onComplete");
            }
        };
        observable.subscribe(observer);
    }
}
