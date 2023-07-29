package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultPlan_2 extends AppCompatActivity {

    ImageView Homeplan , previous_plan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_plan2);

        Homeplan = findViewById(R.id.imageView41);
        previous_plan = findViewById(R.id.imageView43);

        Homeplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        previous_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ResultPlan_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                overridePendingTransition(R.anim.left_open,R.anim.left_out);
            }
        });

    }
}