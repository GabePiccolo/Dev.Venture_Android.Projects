package com.example.imccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextAltura;
    EditText editTextPeso;
    TextView textViewResultado;
    TextView textViewIMDIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.editText_altura);
        editTextPeso = findViewById(R.id.editText_peso);
        textViewResultado = findViewById((R.id.tv_label_resultado));
        textViewIMDIndex = findViewById(R.id.tv_label_imc_index);
    }

    public void calcular(View view) {

        float alturaPessoa = 0;
        float pesoPessoa = 0;
        float result;

        String editTextAlturaContent = editTextAltura.getText().toString();
        String editTextPesoContent = editTextPeso.getText().toString();

        if(editTextAlturaContent.isEmpty()){
            Toast.makeText(this, "Altura vazia.", Toast.LENGTH_LONG).show();
        }else if(editTextPesoContent.isEmpty()){
            Toast.makeText(this, "Peso vazio.", Toast.LENGTH_LONG).show();
        }else {
            alturaPessoa = Float.parseFloat(editTextAlturaContent);
            pesoPessoa = Float.parseFloat(editTextPesoContent);
            result = (float) (pesoPessoa / Math.pow(alturaPessoa, 2.0f));

            if (result <= 18.4){
                textViewIMDIndex.setText("Abaixo");
            }else if (result < 25) {
                textViewIMDIndex.setText("Normal");
            } else if (result < 30) {
                textViewIMDIndex.setText("Sobrepeso");
            } else if (result >= 35){
                textViewIMDIndex.setText("Obesidade 1");
            } else if (result >= 40 ){
                textViewIMDIndex.setText("Obesidade 2");
            }

            textViewResultado.setText(String.valueOf(result));
        }
        hideKeyboard(view);
    }

    private void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
