package com.example.canilroomviewmodel.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.example.canilroomviewmodel.R;
import com.example.canilroomviewmodel.database.RetrofitConfig;
import com.example.canilroomviewmodel.databinding.ActivityMainBinding;
import com.example.canilroomviewmodel.model.Canil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RetrofitConfig retrofitConfig;
    Call<Canil> request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        retrofitConfig = new RetrofitConfig();

        binding.buttonRequest.setOnClickListener(v -> {
            int id = Integer.parseInt(binding.editTextSearch.getText().toString());
            request = retrofitConfig.getCanilAPI().getCanilId(id);
            InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            request.enqueue(new Callback<Canil>() {
                @Override
                public void onResponse(Call<Canil> call, Response<Canil> response) {
                    if (response.isSuccessful()){
                        Canil canil = response.body();
                        binding.textViewId.setText("ID: " + String.valueOf(canil.getId()));
                        binding.textViewName.setText("Name: " + canil.getName());
                        binding.textViewWeight.setText("Weight: " + String.valueOf(canil.getWeight().get("metric")) + " kg");
                        binding.textViewHeight.setText("Height: " + String.valueOf(canil.getHeight().get("metric")) + " cm");
                        binding.textViewLifeSpan.setText("Life span: " + String.valueOf(canil.getLife_span()));
                        binding.textViewBredFor.setText("Bred for: " + canil.getBred_for());
                        binding.textViewBreedGroup.setText("Breed group: " + canil.getBreed_group());
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid ID", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Canil> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Fail to get Dog Breed", Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}
