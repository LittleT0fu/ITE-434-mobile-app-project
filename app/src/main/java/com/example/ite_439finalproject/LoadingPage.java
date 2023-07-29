package com.example.ite_439finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class LoadingPage extends AppCompatActivity {

    ProgressBar pgb;
    private int progressStatus = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);

        pgb = findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progressStatus < 100){
                    progressStatus += progressStatus;
                    pgb.setProgress(progressStatus,true);
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(progressStatus >= 100){
                    startActivity(new Intent(getApplicationContext(),HomePage.class));
                    finish();
                    overridePendingTransition(R.anim.right_open,R.anim.right_out);
                }
            }
        }).start();

    }
}