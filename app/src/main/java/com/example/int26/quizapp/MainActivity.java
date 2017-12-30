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
     * Global Vars
     */

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

    /**
     * This method allows the user to answer by text (number) input
     *
     * @param view
     */

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

    /**
     * This method allows the user to answer by checking multiple correct answers
     * @param view
     */

    public void checkPink(View view)

    {
        CheckBox wrong1 = findViewById(R.id.sbPink);
        CheckBox wrong2 = findViewById(R.id.sbPink2);
        CheckBox right1 = findViewById(R.id.corrPink);
        CheckBox right2 = findViewById(R.id.corrPink1);

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
        }
    }

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkEagles(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.eagles);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkGenesis(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.genesis);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkNirvana(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.nirvana);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkRock(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.rock);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkLedZeppelin(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.led);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkElvis(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.elvis);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */

    public void checkBeatles(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.beatles);

        /**
         * The int checked has the id of checked RadioButto
         */

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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */

    public void checkQueen(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.queen);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */
    public void checkU2(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.u2);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * This method allows The user to answer by checking a radio button so a single possible correct answer
     * @param view
     */

    public void checkPearlJam(View view)

    {
        /**
         * I find the radio group
         */
        RadioGroup rgPink = findViewById(R.id.jam);

        /**
         * The int checked has the id of checked RadioButto
         */
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

    /**
     * When the button is clicked it shows a recap in the TxtView and also a Toast notification that has a Short Length
     * @param view
     */

    public void scopri(View view){

        TextView recap = findViewById(R.id.recap);

        if(corrette < 3){
            testoRecap = getString(R.string.score) + " " + corrette + getString(R.string.zeroScore);
        }else if(corrette >= 3 && corrette <= 6){
            testoRecap = getString(R.string.score) + " " + corrette + getString(R.string.lowScore);
        }else if(corrette > 6 && corrette < 10){
            testoRecap = getString(R.string.score) + " " + corrette + getString(R.string.midScore);
        }else if(corrette >=10){
            testoRecap = getString(R.string.score) + " " + corrette + getString(R.string.highScore);
        }

        recap.setText(testoRecap);

        Context context = getApplicationContext();
        CharSequence text = testoRecap;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * When the button is clicked it lounces an Intent that opens gmail (or only an email app) and allows the user to send the recap content via mail
     * @param view
     */
    public void inviaEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Risultati AppQuiz");
        intent.putExtra(Intent.EXTRA_TEXT, testoRecap);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
