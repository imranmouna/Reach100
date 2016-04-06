package com.ajohlnir.reach100;

import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GamePlayActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    int btn1Val;
    Button btn2;
    int btn2Val;
    Button btn3;
    int btn3Val;
    Button btn4;
    int btn4Val;
    Button btn5;
    int btn5Val;
    Button btn6;
    int btn6Val;
    Button btn7;
    int btn7Val;
    Button btn8;
    int btn8Val;
    Button btn9;
    int btn9Val;
    Button btnPlaceHolder;
    int btnValPlaceholder;

    int colourCode;
    int lowestCodeValue;
    int codePlaceHolder1;
    int codePlaceHolder2;

    TextView gameStatus;
    TextView timer;
    TextView level;
    TextView highScore; //for showing current high score

    int timerVal;
    int levelVal;
    int colorLimit;
    int highScoreVal;

    boolean tutorialComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        //Buttons
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        //TextView
        gameStatus = (TextView) findViewById(R.id.gameStatus);
        timer = (TextView) findViewById(R.id.timer);
        timerVal = 9;
        level = (TextView) findViewById(R.id.level);
        levelVal = 1;
        level.setText(String.valueOf(levelVal));

        highScoreVal = 1;

        highScore = (TextView) findViewById(R.id.highScore);
        highScore.setText(String.valueOf(highScoreVal));

        tutorialComplete = false;
        welcomeWagon();
    }

    @Override
    public void onClick(View v) {

        if (v == btn1){
            if (btn1Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn1.setBackgroundColor(Color.rgb(0,0,0));
                btn1Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn2){
            if (btn2Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn2.setBackgroundColor(Color.rgb(0,0,0));
                btn2Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn3){
            if (btn3Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn3.setBackgroundColor(Color.rgb(0,0,0));
                btn3Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn4){
            if (btn4Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn4.setBackgroundColor(Color.rgb(0,0,0));
                btn4Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn5){
            if (btn5Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn5.setBackgroundColor(Color.rgb(0,0,0));
                btn5Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn6){
            if (btn6Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn6.setBackgroundColor(Color.rgb(0,0,0));
                btn6Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn7){
            if (btn7Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn7.setBackgroundColor(Color.rgb(0,0,0));
                btn7Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn8){
            if (btn8Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn8.setBackgroundColor(Color.rgb(0,0,0));
                btn8Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }

        if (v == btn9){
            if (btn9Val == lowestCodeValue){

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                btn9.setBackgroundColor(Color.rgb(0,0,0));
                btn9Val = 9;
                determineLowestValue();
            }else {
                failure();
            }
        }
        declareWinner();
    }

    private void failure() {

        //Play Sound
        final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.reset);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayerB) {
                mediaPlayerB.reset();
                mediaPlayerB.release();
            }
        });

        if (tutorialComplete){
            timerVal = 10;
            levelVal = 1;
            level.setText(String.valueOf(levelVal));
            setColour();
            determineLowestValue();
        }else {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            gameStatus.setText("Follow The Rainbow!");
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gameStatus.setText("");
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                }
            }, 1000);
            tutorialColourSet();
        }
    }

    private void setColour() {

        for (int setColour = 1; setColour < 10; setColour++){

            if (setColour == 1){
                btnPlaceHolder = btn1;
                colourCodeGeneration();
                btn1Val = btnValPlaceholder;
            }else if (setColour == 2){
                btnPlaceHolder = btn2;
                colourCodeGeneration();
                btn2Val = btnValPlaceholder;
            }else if (setColour == 3){
                btnPlaceHolder = btn3;
                colourCodeGeneration();
                btn3Val = btnValPlaceholder;
            }else if (setColour == 4){
                btnPlaceHolder = btn4;
                colourCodeGeneration();
                btn4Val = btnValPlaceholder;
            }else if (setColour == 5){
                btnPlaceHolder = btn5;
                colourCodeGeneration();
                btn5Val = btnValPlaceholder;
            }else if (setColour == 6){
                btnPlaceHolder = btn6;
                colourCodeGeneration();
                btn6Val = btnValPlaceholder;
            }else if (setColour == 7){
                btnPlaceHolder = btn7;
                colourCodeGeneration();
                btn7Val = btnValPlaceholder;
            }else if (setColour == 8){
                btnPlaceHolder = btn8;
                colourCodeGeneration();
                btn8Val = btnValPlaceholder;
            }else if (setColour == 9) {
                btnPlaceHolder = btn9;
                colourCodeGeneration();
                btn9Val = btnValPlaceholder;
            }else {
                //Do Nothing
            }
        }
    }

    private void colourCodeGeneration() {

        if (levelVal <= 3){
            colorLimit = 3;
        }else if (levelVal > 3 && levelVal <= 10){
            colorLimit = 4;
        }else if (levelVal > 10 && levelVal <= 15){
            colorLimit = 5;
        }else if (levelVal > 15 && levelVal <= 20){
            colorLimit = 6;
        }else if (levelVal > 20 && levelVal <= 30){
            colorLimit = 7;
        }else if (levelVal > 30 && levelVal <= 40){
            colorLimit = 8;
        }else if (levelVal > 40 && levelVal <= 50){
            colorLimit = 9;
        }else {
            colorLimit = 10;
        }

        Random r = new Random();
        colourCode = r.nextInt(colorLimit - 1) + 1;

        if (colourCode == 1){
            btnPlaceHolder.setBackgroundColor(Color.rgb(255, 0, 0)); //Red
            btnValPlaceholder = 1;
        }else if (colourCode == 2){
            btnPlaceHolder.setBackgroundColor(Color.rgb(255, 165, 0)); //Orange
            btnValPlaceholder = 2;
        }else if (colourCode == 3){
            btnPlaceHolder.setBackgroundColor(Color.rgb(255, 255, 0)); //Yellow
            btnValPlaceholder = 3;
        }else if (colourCode == 4){
            btnPlaceHolder.setBackgroundColor(Color.rgb(0, 128, 0)); //Green
            btnValPlaceholder = 4;
        }else if (colourCode == 5){
            btnPlaceHolder.setBackgroundColor(Color.rgb(0, 0, 255)); //Blue
            btnValPlaceholder = 5;
        }else if (colourCode == 6){
            btnPlaceHolder.setBackgroundColor(Color.rgb(75, 0, 130)); //Indigo
            btnValPlaceholder = 6;
        }else if (colourCode == 7){
            btnPlaceHolder.setBackgroundColor(Color.rgb(238, 130, 238)); //Violet
            btnValPlaceholder = 7;
        }else if (colourCode == 8){
            btnPlaceHolder.setBackgroundColor(Color.rgb(255, 255, 255)); //White
            btnValPlaceholder = 8;
        }else if (colourCode == 9){
            btnPlaceHolder.setBackgroundColor(Color.rgb(0, 0, 0)); // Black
            btnValPlaceholder = 9;
        }else {
            //Do Nothing
        }
    }

    private void determineLowestValue(){

        codePlaceHolder1 = btn1Val;

        for (int checkBtnVal = 1; checkBtnVal < 10; checkBtnVal++){

            if (checkBtnVal == 1){
                codePlaceHolder2 = btn1Val;
            }else if (checkBtnVal == 2){
                codePlaceHolder2 = btn2Val;
            }else if (checkBtnVal == 3){
                codePlaceHolder2 = btn3Val;
            }else if (checkBtnVal == 4){
                codePlaceHolder2 = btn4Val;
            }else if (checkBtnVal == 5){
                codePlaceHolder2 = btn5Val;
            }else if (checkBtnVal == 6){
                codePlaceHolder2 = btn6Val;
            }else if (checkBtnVal == 7){
                codePlaceHolder2 = btn7Val;
            }else if (checkBtnVal == 8){
                codePlaceHolder2 = btn8Val;
            }else if (checkBtnVal == 9){
                codePlaceHolder2 = btn9Val;
            }

            if (codePlaceHolder1 <= codePlaceHolder2){
                lowestCodeValue = codePlaceHolder1;
            }else {
                lowestCodeValue = codePlaceHolder2;
                codePlaceHolder1 = lowestCodeValue;
            }
        }
    }

    private void declareWinner(){
        if (btn1Val == 9 && btn2Val == 9 && btn3Val == 9 && btn4Val == 9 && btn5Val == 9 && btn6Val == 9 && btn7Val == 9 && btn8Val == 9 && btn9Val == 9) {

            if (tutorialComplete){
                //disable the buttons so the user cant spam to increase level count on changeover
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);

                //Play Sound
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.levelup);
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mediaPlayerB) {
                        mediaPlayerB.reset();
                        mediaPlayerB.release();
                    }
                });

                timerVal = 10;
                levelVal = levelVal + 1;
                level.setText(String.valueOf(levelVal));
                gameStatus.setText("Level " + String.valueOf(levelVal));

                //check and set high score variable if current level exceeds highscore
                if (levelVal > highScoreVal){
                    highScoreVal = levelVal;
                    //highScore.setTypeface(null, Typeface.BOLD);
                    highScore.setText(String.valueOf(highScoreVal));
                }

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        restart();
                    }
                }, 1000);
            }else {
                //disable the buttons so the user cant spam to increase level count on changeover
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);

                gameStatus.setText("Tutorial Complete!");
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tutorialComplete = true;
                        restart();
                        setTimer();
                    }
                }, 3000);
            }
        }
    }

    private void restart(){
        gameStatus.setText("");
        setColour();
        determineLowestValue();

        //enable the buttons again
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

    private void setTimer(){


        timer.setText(String.valueOf(timerVal));
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                timerVal = timerVal - 1;
                if (timerVal == 0) {

                    //Play Sound
                    final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.reset);
                    mediaPlayer.start();

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mediaPlayerB) {
                            mediaPlayerB.reset();
                            mediaPlayerB.release();
                        }
                    });

                    timerVal = 9;
                    levelVal = 1;
                    level.setText(String.valueOf(levelVal));
                    restart();
                }
                timer.setText(String.valueOf(timerVal));
                setTimer();
            }
        }, 1000);
    }

    /**
     * Method to show instructions on first launch
     */
    private void welcomeWagon(){

        blackOut();
        gameStatus.setText("Follow The Rainbow!");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

        //Instructions
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                gameStatus.setText("");

                tutorialColourSet();

                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
            }
        }, 5000);
    }

    private void tutorialColourSet() {
        btn1.setBackgroundColor(Color.rgb(255, 0, 0)); //Red
        btn1Val = 1;

        btn2.setBackgroundColor(Color.rgb(255, 165, 0)); //Orange
        btn2Val = 2;

        btn3.setBackgroundColor(Color.rgb(255, 255, 0)); //Yellow
        btn3Val = 3;

        btn4.setBackgroundColor(Color.rgb(0, 128, 0)); //Green
        btn4Val = 4;

        btn5.setBackgroundColor(Color.rgb(0, 0, 255)); //Blue
        btn5Val = 5;

        btn6.setBackgroundColor(Color.rgb(75, 0, 130)); //Indigo
        btn6Val = 6;

        btn7.setBackgroundColor(Color.rgb(238, 130, 238)); //Violet
        btn7Val = 7;

        btn8.setBackgroundColor(Color.rgb(255, 255, 255)); //White
        btn8Val = 8;

        btn9.setBackgroundColor(Color.rgb(0, 0, 0)); // Black
        btn9Val = 9;

        determineLowestValue();
    }

    private void blackOut() {
        btn1.setBackgroundColor(Color.rgb(0, 0, 0));
        btn1Val = 1;

        btn2.setBackgroundColor(Color.rgb(0, 0, 0));
        btn2Val = 2;

        btn3.setBackgroundColor(Color.rgb(0, 0, 0));
        btn3Val = 3;

        btn4.setBackgroundColor(Color.rgb(0, 0, 0));
        btn4Val = 4;

        btn5.setBackgroundColor(Color.rgb(0, 0, 0));
        btn5Val = 5;

        btn6.setBackgroundColor(Color.rgb(0, 0, 0));
        btn6Val = 6;

        btn7.setBackgroundColor(Color.rgb(0, 0, 0));
        btn7Val = 7;

        btn8.setBackgroundColor(Color.rgb(0, 0, 0));
        btn8Val = 8;

        btn9.setBackgroundColor(Color.rgb(0, 0, 0));
        btn9Val = 9;
    }
}
