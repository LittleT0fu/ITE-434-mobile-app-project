package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultCreative_1 extends AppCompatActivity {

    ImageView Homecreate , next_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_creative1);

        Homecreate = findViewById(R.id.imageView30);
        next_create = findViewById(R.id.imageView20);

        Homecreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        next_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultCreative_2.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });
    }
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CollectionMenu.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}