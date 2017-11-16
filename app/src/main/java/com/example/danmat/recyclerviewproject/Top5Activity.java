package com.example.danmat.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Top5Activity extends AppCompatActivity {
    private RecyclerView top5RecyclerView;
    ArrayList<Pet> petsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top5);

        top5RecyclerView =(RecyclerView) findViewById(R.id.main_recyclerView_top5);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        top5RecyclerView.setLayoutManager(linearLayoutManager);

        initializePetsList();
        initializeAdapter();
    }

    public void initializeAdapter(){
        PetAdapter petAdapter = new PetAdapter(petsList, this);
        top5RecyclerView.setAdapter(petAdapter);
    }

    public void initializePetsList(){
        petsList = new ArrayList<Pet>();
        petsList.add(new Pet("Vato Loco", R.drawable.dog_chihuahua_bone_icon, 5));
        petsList.add(new Pet("Laika", R.drawable.dog_haski_icon, 4));
        petsList.add(new Pet("Mortis", R.drawable.dog_bark_icon, 3));
        petsList.add(new Pet("Gordo", R.drawable.dog_dalmatian_king_icon, 3));
        petsList.add(new Pet("Perro", R.drawable.dog_einstein_icon, 1));
    }
}
