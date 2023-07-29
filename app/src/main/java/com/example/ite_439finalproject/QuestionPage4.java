package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionPage4 extends AppCompatActivity {

    Button answer1 , answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page4);

        final SharedPreferences sp = this.getSharedPreferences("share_name" , Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        answer1 = findViewById(R.id.button2);
        answer2 = findViewById(R.id.button4);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int fun = sp.getInt("fun",0);
                int adventure = sp.getInt("adventure",0);
                int craft = sp.getInt("craft",0);
                int creative = sp.getInt("creative",0);
                int plan = sp.getInt("plan",0);

                craft += 1;

                editor.putInt("fun",fun);
                editor.putInt("adventure",adventure);
                editor.putInt("craft",craft);
                editor.putInt("creative",creative);
                editor.putInt("plan",plan);
                editor.commit();

                Intent intent = new Intent(getApplicationContext(),QuestionPage5.class);

                startActivity(intent);
                overridePendingTransition(R.anim.scrolldown_open,R.anim.scrolldown_close);
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

                plan += 1;

                editor.putInt("fun",fun);
                editor.putInt("adventure",adventure);
                editor.putInt("craft",craft);
                editor.putInt("creative",creative);
                editor.putInt("plan",plan);
                editor.commit();

                Intent intent = new Intent(getApplicationContext(),QuestionPage5.class);

                startActivity(intent);
                overridePendingTransition(R.anim.scrolldown_open,R.anim.scrolldown_close);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),HomePage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
    }
}