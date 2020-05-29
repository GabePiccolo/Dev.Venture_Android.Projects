package com.example.digitalzoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Animal> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateAnimalsList();

        AnimalListAdapter adapter = new AnimalListAdapter(animalList);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void populateAnimalsList(){
        Animal animal1 = new  Animal(1 , "Guepardo", "Felino", 15, R.drawable.animal1);
        Animal animal2 = new  Animal(2 , "Tigre", "Felino", 18, R.drawable.animal2);
        Animal animal3 = new  Animal(3 , "Qwoka", "Felino", 6, R.drawable.animal3);
        Animal animal4 = new  Animal(4 , "Leopardo", "Felino", 14, R.drawable.animal4);
        Animal animal5 = new  Animal(5 , "Leão", "Felino", 19, R.drawable.animal5);

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
    }
}
