package com.example.viewmodellab.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.viewmodellab.R;
import com.example.viewmodellab.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    MyViewModel viewModel;
    TextView textView;
    Button buttonNewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonNewName = findViewById(R.id.buttonNewName);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        viewModel.getName().observe(this, s -> {
            textView.setText(s);
        });

        buttonNewName.setOnClickListener(v -> {
            viewModel.getName().setValue("New Dev Venture Class!");
        });
    }
}
