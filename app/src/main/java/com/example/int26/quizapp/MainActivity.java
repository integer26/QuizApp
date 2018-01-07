package com.example.int26.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Global Vars declarations
     */

    int corrette = 0;
    EditText nMembri;
    CheckBox wrong1;
    CheckBox wrong2;
    CheckBox right1;
    CheckBox right2;
    RadioGroup rgEag;
    RadioGroup rgGen;
    RadioGroup rgNir;
    RadioGroup rgRock;
    RadioGroup rgLed;
    RadioGroup rgElvis;
    RadioGroup rgBeat;
    RadioGroup rgQueen;
    RadioGroup rgU2;
    RadioGroup rgJam;
    RadioGroup rgRush;
    String username;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Prevent the keyboard to pop up automatically

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //View Declarations in onCreate to improve CPU cycles
        nMembri = findViewById(R.id.metallica);
        wrong1 = findViewById(R.id.sbPink);
        wrong2 = findViewById(R.id.sbPink2);
        right1 = findViewById(R.id.corrPink);
        right2 = findViewById(R.id.corrPink1);
        rgEag = findViewById(R.id.eagles);
        rgGen = findViewById(R.id.genesis);
        rgNir = findViewById(R.id.nirvana);
        rgRock = findViewById(R.id.rock);
        rgLed = findViewById(R.id.led);
        rgElvis = findViewById(R.id.elvis);
        rgBeat = findViewById(R.id.beatles);
        rgQueen = findViewById(R.id.queen);
        rgU2 = findViewById(R.id.u2);
        rgJam = findViewById(R.id.jam);
        rgRush = findViewById(R.id.rush);

        Intent intent = getIntent();
        username = intent.getExtras().getString("username");
    }



    /**
     * When the button is clicked it shows a recap in the TxtView and also a Toast notification that has a Short Length
     * @param view
     */

    public void scopri(View view) {

        //new code

        String nome = nMembri.getText().toString();

        if(nome.equals("4")){
            nMembri.setTextColor(Color.GREEN);
            corrette++;
        }else{

            nMembri.setTextColor(Color.RED);
        }


        boolean checked;
        boolean checked2;

        if(checked=wrong1.isChecked()){
            wrong1.setTextColor(Color.RED);
        }
        if(checked=wrong2.isChecked()){
            wrong2.setTextColor(Color.RED);
        }
        if(checked=right1.isChecked()){
            right1.setTextColor(Color.GREEN);
        }
        if (checked = right2.isChecked()){
            right2.setTextColor(Color.GREEN);
        }

        checked=right1.isChecked();
        checked2=right2.isChecked();

        if(checked && checked2 ){

            corrette = corrette + 2;
        } else if (checked || checked2) {

            corrette++;
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        int checkedRadio = rgEag.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrEag);
        RadioButton radio = findViewById(checkedRadio);

        if (rgEag.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }
        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgGen.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrGen);
        radio = findViewById(checkedRadio);

        if (rgGen.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgNir.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrNir);
        radio = findViewById(checkedRadio);

        if (rgNir.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgRock.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrRock);
        radio = findViewById(checkedRadio);

        if (rgRock.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }


        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgLed.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrZepp);
        radio = findViewById(checkedRadio);

        if (rgLed.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgElvis.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrElv);
        radio = findViewById(checkedRadio);

        if (rgElvis.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */

        checkedRadio = rgBeat.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrBeat);
        radio = findViewById(checkedRadio);

        if (rgBeat.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgQueen.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrQue);
        radio = findViewById(checkedRadio);

        if (rgQueen.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }


        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgU2.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrU2);
        radio = findViewById(checkedRadio);

        if (rgU2.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgJam.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrJam);
        radio = findViewById(checkedRadio);

        if (rgJam.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        /**
         * The int checked has the id of checked RadioButto
         */
        checkedRadio = rgRush.getCheckedRadioButtonId();

        corretto = findViewById(R.id.corrrush);
        radio = findViewById(checkedRadio);

        if (rgRush.getCheckedRadioButtonId() == -1) {

        } else {

            if (radio == corretto) {
                corretto.setTextColor(Color.GREEN);
                corrette++;
            } else {

                radio.setTextColor(Color.RED);
            }
        }

        //Launches the Recap activity
        Intent i = new Intent(MainActivity.this, Recap.class);
        i.putExtra("corrette", corrette);
        i.putExtra("username", username);
        startActivity(i);
    }

}
