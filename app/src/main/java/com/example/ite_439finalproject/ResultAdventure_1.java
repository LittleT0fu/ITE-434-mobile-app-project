package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultAdventure_1 extends AppCompatActivity {

    private
    ImageView HomeAdven, adven_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_adventure1);

        HomeAdven = findViewById(R.id.imageView32);
        adven_next = findViewById(R.id.imageView34);

        adven_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultAdventure_2.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        HomeAdven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });


    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CollectionMenu.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}