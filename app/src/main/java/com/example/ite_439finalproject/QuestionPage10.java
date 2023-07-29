package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionPage10 extends AppCompatActivity {

    Button answer1 , answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page10);

        final SharedPreferences sp = this.getSharedPreferences("share_name" , Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        answer1 = findViewById(R.id.button9);
        answer2 = findViewById(R.id.button10);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int fun = sp.getInt("fun",0);
                int adventure = sp.getInt("adventure",0);
                int craft = sp.getInt("craft",0);
                int creative = sp.getInt("creative",0);
                int plan = sp.getInt("plan",0);

                adventure += 1;

                int max = Math.max(fun,Math.max(adventure,Math.max(craft,Math.max(creative,plan))));

                if(max == fun){
                    startActivity(new Intent(getApplicationContext(),ResultFun_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                } else if (max == adventure) {
                    startActivity(new Intent(getApplicationContext(),ResultAdventure_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                } else if (max == craft) {
                    startActivity(new Intent(getApplicationContext(),ResultCrafty_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                } else if (max == creative) {
                    startActivity(new Intent(getApplicationContext(),ResultCreative_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                } else if (max == plan) {
                    startActivity(new Intent(getApplicationContext(),ResultPlan_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                }else{
                    startActivity(new Intent(getApplicationContext(),ResultFun_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                }


            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fun = sp.getInt("fun",0);
                int adventure = sp.getInt("adventure",0);
                int craft = sp.getInt("craft",0);
                int creative = sp.getInt("creative",0);
                int plan = sp.getInt("plan",0);

                fun += 1;

                int max = Math.max(fun,Math.max(adventure,Math.max(craft,Math.max(creative,plan))));

                if(max == fun){
                    startActivity(new Intent(getApplicationContext(),ResultFun_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                } else if (max == adventure) {
                    startActivity(new Intent(getApplicationContext(),ResultAdventure_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                } else if (max == craft) {
                    startActivity(new Intent(getApplicationContext(),ResultCrafty_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                } else if (max == creative) {
                    startActivity(new Intent(getApplicationContext(),ResultCreative_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                } else if (max == plan) {
                    startActivity(new Intent(getApplicationContext(),ResultPlan_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                }else{
                    startActivity(new Intent(getApplicationContext(),ResultFun_1.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                }

            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}