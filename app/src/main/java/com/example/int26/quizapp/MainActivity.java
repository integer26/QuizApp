package com.example.int26.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variabili globali

    int corrette = 0;
    String testoRecap = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Prevent the keyboard to pop up automatically
         */
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void checkMetallica(View view)

    {
        EditText nMembri = findViewById(R.id.metallica);

        String nome = nMembri.getText().toString();

        if(nome.equals("4")){
            nMembri.setTextColor(Color.GREEN);
            corrette++;
        }else{

            nMembri.setTextColor(Color.RED);
        }
    }

    public void checkPink(View view)

    {
        CheckBox wrong1 = findViewById(R.id.sbPink);
        CheckBox wrong2 = findViewById(R.id.sbPink2);
        CheckBox right1 = findViewById(R.id.corrPink);
        CheckBox right2 = findViewById(R.id.corrPink1);

        boolean checked;
        boolean checked2;

        //Controllo i vari casi che si possono presentare con le checkBox
        if(checked=wrong1.isChecked()){
            wrong1.setTextColor(Color.RED);
        }
        if(checked=wrong2.isChecked()){
            wrong2.setTextColor(Color.RED);
        }
        if(checked=right1.isChecked()){
            right1.setTextColor(Color.GREEN);
        }
            if(checked=right2.isChecked()){
            right2.setTextColor(Color.GREEN);
        }

        checked=right1.isChecked();
        checked2=right2.isChecked();

        if(checked && checked2 ){

            corrette = corrette + 2;
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

    public void scopri(View view){

        TextView recap = findViewById(R.id.recap);

        if(corrette < 3){
            testoRecap = "Il tuo punteggio è: " + corrette + "\nNon sai Praticamente niente riguardo al Rock!";
        }else if(corrette >= 3 && corrette <= 6){
            testoRecap = "Il tuo punteggio è: "+ corrette + "\nPuoi fare di meglio!";
        }else if(corrette > 6 && corrette < 10){
            testoRecap = "Il tuo punteggio è: "+ corrette + "\nBen fatto!";
        }else if(corrette >=10){
            testoRecap = "Il tuo punteggio è: "+ corrette + "\nGrandioso, sei informatissimo sul mondo Rock!";
        }

        recap.setText(testoRecap);
    }

    public void inviaEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "giorgio.schirano@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Risultati AppQuiz");
        intent.putExtra(Intent.EXTRA_TEXT, testoRecap);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
