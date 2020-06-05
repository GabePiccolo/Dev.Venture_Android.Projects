package com.example.desafiodevventure.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.desafiodevventure.R;
import com.example.desafiodevventure.adapter.GridViewAdapter;
import com.example.desafiodevventure.model.Cats;
import com.example.desafiodevventure.retrofit.CatsAPI;
import com.example.desafiodevventure.retrofit.RetrofitConfig;
import com.example.desafiodevventure.viewmodel.CatsViewModel;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private GridViewAdapter adapter;
    private GridView gridView;
    public CatsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar progressBar = findViewById(R.id.progress_horizontal);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(View.VISIBLE);

        CatsAPI catsAPI = RetrofitConfig.RetrofitConfig().create(CatsAPI.class);
    }

    private void populateGridView(List<Cats.Object> catsList){
        gridView = findViewById(R.id.gridView);
        adapter = new GridViewAdapter(catsList, this);
        gridView.setAdapter(adapter);
    }
}