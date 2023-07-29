package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollectionMenu extends AppCompatActivity {

    Button funB , planB , craftB , advenB ,createB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection_menu);
        funB = findViewById(R.id.fun_button);
        planB = findViewById(R.id.planing_button);
        craftB = findViewById(R.id.crafty_button);
        advenB = findViewById(R.id.adventure_button);
        createB= findViewById(R.id.creative_button);


        funB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultFun_1.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        planB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultPlan_1.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        craftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultCrafty_1.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        advenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultAdventure_1.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        createB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultCreative_1.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });
    }
}