package com.example.int26.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int corrette = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkMetallica(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgMetallica = findViewById(R.id.metallica);

        //Assegno ad un int l'id del button checkato
        int checked = rgMetallica.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrMet);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkPink(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.pink);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrPink);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkEagles(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.eagles);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrEag);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkGenesis(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.genesis);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrGen);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkNirvana(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.nirvana);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrNir);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkRock(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.rock);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrRock);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkLedZeppelin(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.led);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrZepp);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkElvis(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.elvis);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrElv);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkBeatles(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.beatles);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrBeat);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkQueen(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.queen);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrQue);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkU2(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.u2);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrU2);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }

    public void checkPearlJam(View view)

    {
        //Trovo il gruppo di radio
        RadioGroup rgPink = findViewById(R.id.jam);

        //Assegno ad un int l'id del button checkato
        int checked = rgPink.getCheckedRadioButtonId();

        RadioButton corretto = findViewById(R.id.corrJam);
        RadioButton radio = findViewById(checked);

        if(radio == corretto){
            corretto.setTextColor(Color.GREEN);
            corrette++;
        }else{

            radio.setTextColor(Color.RED);
        }
    }
}
