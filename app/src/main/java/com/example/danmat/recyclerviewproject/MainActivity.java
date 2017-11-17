package com.example.danmat.recyclerviewproject;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pet> petsList;
    private RecyclerView petsListRecyclerView;
    private ImageView toolBarImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton uploadButton = (FloatingActionButton) findViewById(R.id.main_floatingButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton para subir", Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar actionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(actionBar);
        toolBarImageView = (ImageView) findViewById(R.id.toolbar_imageView_favs);
        toolBarImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent top5Intent = new Intent(MainActivity.this, Top5Activity.class);
                MainActivity.this.startActivity(top5Intent);
            }
        });

        petsListRecyclerView =(RecyclerView) findViewById(R.id.main_recyclerView_pets);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        petsListRecyclerView.setLayoutManager(linearLayoutManager);

        initializePetsList();
        initializeAdapter();
    }

    public void initializeAdapter(){
        PetAdapter petAdapter = new PetAdapter(petsList, this);
        petsListRecyclerView.setAdapter(petAdapter);
    }

    public void initializePetsList(){
        petsList = new ArrayList<Pet>();
        petsList.add(new Pet("Mortis", R.drawable.dog_bark_icon, 3));
        petsList.add(new Pet("Vato Loco", R.drawable.dog_chihuahua_bone_icon, 5));
        petsList.add(new Pet("Gordo", R.drawable.dog_dalmatian_king_icon, 3));
        petsList.add(new Pet("Perro", R.drawable.dog_einstein_icon, 1));
        petsList.add(new Pet("Laika", R.drawable.dog_haski_icon, 4));
        petsList.add(new Pet("Linda", R.drawable.dog_einstein_icon, 4));
        petsList.add(new Pet("Doggy", R.drawable.dog_dalmatian_king_icon, 5));
    }
}
