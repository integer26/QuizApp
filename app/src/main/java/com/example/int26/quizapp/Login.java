package com.example.int26.quizapp;

import android.animation.Animator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username;
    Button login;
    String usesrnamestor = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Prevent the keyboard to pop up automatically

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        username = findViewById(R.id.editLogin);
        login = findViewById(R.id.loginButton);


    }

    public void login(View view) {

        /*
        When the user Press the button the username will be stored and will be launched the MainActivity
         */

        usesrnamestor = username.getText().toString();

        if (usesrnamestor.matches("")) {

            Toast.makeText(this, R.string.noUserName, Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(Login.this, MainActivity.class);
            intent.putExtra("username", usesrnamestor);
            startActivity(intent);
        }
    }

}
