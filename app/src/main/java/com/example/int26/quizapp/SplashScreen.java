package com.example.int26.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        final Intent mioIntent = new Intent(getApplicationContext(), Login.class);

        Thread mioThread = new Thread(){

            @Override
            public void run(){
                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally {
                    startActivity(mioIntent);
                    finish();
                }
            }


        };

        mioThread.start();
    }
}


