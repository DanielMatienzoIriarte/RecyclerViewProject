package com.example.danmat.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PetDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_detail);

        ImageView petDetail_avatar;
        TextView petDetail_name;

        Bundle params = getIntent().getExtras();
        int petAvatar = getIntent().getIntExtra("Avatar", 0);
        String petName = params.getString("Name");
//        String petRate = params.getString("RateValue");

        petDetail_avatar = (ImageView) findViewById(R.id.petDetail_avatar);
        petDetail_name = (TextView) findViewById(R.id.petDetail_name);
//        petDetail_avatar = (ImageView) findViewById(R.id.petDetail_avatar);

        petDetail_avatar.setImageResource(petAvatar);
        petDetail_name.setText(petName);
    }
}
