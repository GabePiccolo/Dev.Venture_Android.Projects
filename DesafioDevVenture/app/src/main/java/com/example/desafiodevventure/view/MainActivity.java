package com.example.desafiodevventure.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import com.example.desafiodevventure.R;
import com.example.desafiodevventure.databinding.ActivityMainBinding;
import com.example.desafiodevventure.model.Cats;
import com.example.desafiodevventure.retrofit.RetrofitConfig;
import com.example.desafiodevventure.viewmodel.CatsViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CatsViewModel catsViewModel;

    public ActivityMainBinding activityMainBinding;
    RecyclerView recyclerView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listAdapter = new com.example.desafiodevventure.recyclerview.ListAdapter();
        recyclerView.setAdapter(listAdapter);

    }

    private void receivePhoto(){
        catsViewModel.photoURL.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                setImageView(activityMainBinding., s);
            }
        });
    }

    public void setImageView(ImageView image, String url){
        RequestOptions requestOptions = new RequestOptions()
                .fitCenter();
        Glide.with(getApplicationContext())
                .setDefaultRequestOptions(requestOptions)
                .load(url)
                .into(image);
    }
}