package com.example.danmat.recyclerviewproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActionBarActivity extends AppCompatActivity {
    ImageView toolBarImageView;
    private Activity petMainActivity;

    public ActionBarActivity() {}

    public ActionBarActivity(Activity petMainActivity) {
        this.petMainActivity = petMainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionbar);

        toolBarImageView = (ImageView) findViewById(R.id.toolbar_imageView_favs);
        toolBarImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent petDetailIntent = new Intent(petMainActivity, Top5Activity.class);
                petMainActivity.startActivity(petDetailIntent);
            }
        });
    }
}
