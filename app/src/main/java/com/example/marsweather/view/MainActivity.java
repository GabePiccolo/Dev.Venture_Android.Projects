package com.example.marsweather.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.marsweather.R;
import com.example.marsweather.databinding.ActivityMainBinding;
import com.example.marsweather.model.WeatherStatus;
import com.example.marsweather.retrofit.RetrofitConfig;
import com.example.marsweather.viewmodel.MarsWeatherViewModel;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    public ActivityMainBinding activityMainBinding;
    public MarsWeatherViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MarsWeatherViewModel.class);

        viewModel.getLatestMarsWeather();

        receiveWeatherStatus();
        receivePhoto();
    }

    private void receiveWeatherStatus(){
        viewModel.weatherStatusMutableLiveData.observe(this, weatherStatus ->
                activityMainBinding.setWeatherStatus(weatherStatus));
    }

    private void receivePhoto(){
        viewModel.photoURL.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                setImageView(activityMainBinding.imageView, s);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_camera){
            viewModel.getMarsPhoto();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setImageView(ImageView image, String url){
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(android.R.drawable.ic_dialog_alert)
                .fitCenter();
        Glide.with(getApplicationContext())
                .setDefaultRequestOptions(requestOptions)
                .load(url)
                .into(image);
    }
}