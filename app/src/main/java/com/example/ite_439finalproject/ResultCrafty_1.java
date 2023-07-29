package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultCrafty_1 extends AppCompatActivity {

    ImageView Homecraft , next_craft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_crafty1);

        Homecraft = findViewById(R.id.imageView28);
        next_craft = findViewById(R.id.imageView19);

        Homecraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
        next_craft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultCrafty_2.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });
    }
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CollectionMenu.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}