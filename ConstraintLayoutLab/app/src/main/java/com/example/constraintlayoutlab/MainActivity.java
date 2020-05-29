package com.example.constraintlayoutlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupGender;
    RadioButton radioButtonGender;
    String selectedGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupGender = findViewById(R.id.radioGroup_gender);
    }

    public void selectedGender(View v){

        int selectRadioButtonId = radioGroupGender.getCheckedRadioButtonId();
        radioGroupGender = findViewById(selectRadioButtonId);
        selectedGender = radioButtonGender.getText().toString();
        Toast.makeText(this, "Radio button: " + radioButtonGender.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
