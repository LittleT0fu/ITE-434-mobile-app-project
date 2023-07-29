package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultFun_1 extends AppCompatActivity {

    ImageView Homefun , next_fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_fun1);

        Homefun = findViewById(R.id.imageView25);
        next_fun = findViewById(R.id.imageView18);

        Homefun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        next_fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultFun_2.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });
    }
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),CollectionMenu.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}