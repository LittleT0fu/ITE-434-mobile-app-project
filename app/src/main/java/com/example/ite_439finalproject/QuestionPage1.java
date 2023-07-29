package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionPage1 extends AppCompatActivity {

    Button answer1 , answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page1);

        final SharedPreferences sp = this.getSharedPreferences("share_name" , Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        answer1 = findViewById(R.id.button5);
        answer2 = findViewById(R.id.button6);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int fun = 1;
                int adventure = 1;
                int craft = 0;
                int creative = 1;
                int plan = 0;


                Intent intent = new Intent(getApplicationContext(),QuestionPage2.class);

                editor.putInt("fun",fun);
                editor.putInt("adventure",adventure);
                editor.putInt("craft",craft);
                editor.putInt("creative",creative);
                editor.putInt("plan",plan);
                editor.commit();

                startActivity(intent);
                overridePendingTransition(R.anim.scrolldown_open,R.anim.scrolldown_close);

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int fun = 0;
                int adventure = 0;
                int craft = 1;
                int creative = 0;
                int plan = 1;

                Intent intent = new Intent(getApplicationContext(),QuestionPage2.class);

                editor.putInt("fun",fun);
                editor.putInt("adventure",adventure);
                editor.putInt("craft",craft);
                editor.putInt("creative",creative);
                editor.putInt("plan",plan);
                editor.commit();

                startActivity(intent);
                overridePendingTransition(R.anim.scrolldown_open,R.anim.scrolldown_close);
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }
}