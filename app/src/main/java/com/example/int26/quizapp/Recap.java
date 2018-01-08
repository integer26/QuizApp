package com.example.int26.quizapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Recap extends AppCompatActivity {

    String testoRecap = "";
    TextView recap;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        //Finds the TextView

        recap = findViewById(R.id.recapText);

        //Get in the integer in the previous activity
        Intent intent = getIntent();
        int corrette = intent.getIntExtra("corrette", 0);
        username = intent.getExtras().getString("username");

        //Set the text when the activity is created
        if (corrette < 3) {
            testoRecap = username + " " + getString(R.string.score) + " " + corrette + getString(R.string.zeroScore);
        } else if (corrette >= 3 && corrette <= 6) {
            testoRecap = username + " " + getString(R.string.score) + " " + corrette + getString(R.string.lowScore);
        } else if (corrette > 6 && corrette <= 10) {
            testoRecap = username + " " + getString(R.string.score) + " " + corrette + getString(R.string.midScore);
        } else if (corrette >= 11) {
            testoRecap = username + " " + getString(R.string.score) + " " + corrette + getString(R.string.highScore);
        }

        //Set the text into the testview of the recap
        recap.setText(testoRecap);

    }

    /**
     * When the button is clicked it lounces an Intent that opens gmail (or only an email app) and allows the user to send the recap content via mail
     *
     * @param view
     */
    public void inviaEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.results));
        intent.putExtra(Intent.EXTRA_TEXT, testoRecap);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    /**
     * This method ends the app
     *
     * @param view
     */
    public void exit(View view) {

        finish();
        moveTaskToBack(true);
    }
}

