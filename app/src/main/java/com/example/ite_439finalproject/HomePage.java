package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    Button collec_button , test_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        collec_button = findViewById(R.id.collection_button);
        test_button = findViewById(R.id.taketest_button);

        collec_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CollectionMenu.class));
                overridePendingTransition(R.anim.right_open,R.anim.right_out);
            }
        });

        test_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),QuestionPage1.class));
                overridePendingTransition(R.anim.scrolldown_open,R.anim.scrolldown_close);
            }
        });
    }
}