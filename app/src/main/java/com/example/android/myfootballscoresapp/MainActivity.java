package com.example.android.myfootballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    int RedCardForTeamA;
    int RedCardForTeamB;

    int YellowCardForTeamA;
    int YellowCardForTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            YellowCardForTeamA = savedInstanceState.getInt("YellowCardForTeamA");
            YellowCardForTeamB = savedInstanceState.getInt("YellowCardForTeamB");
            RedCardForTeamA = savedInstanceState.getInt("RedCardforTeamA");
            RedCardForTeamB = savedInstanceState.getInt("RedCardforTeamB");
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
            displayRedForTeamA(RedCardForTeamA);
            displayRedForTeamB(RedCardForTeamB);
            displayYellowForTeamA(YellowCardForTeamA);
            displayYellowForTeamB(YellowCardForTeamB);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);
        savedInstanceState.putInt("YellowCardForTeamA", YellowCardForTeamA);
        savedInstanceState.putInt("YellowCardForTeamB", YellowCardForTeamB);
        savedInstanceState.putInt("RedCardForTeamA", RedCardForTeamA);
        savedInstanceState.putInt("RedCardForTeamB", RedCardForTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void GoalForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void RedCardForTeamA(View v) {
        RedCardForTeamA++;
        displayRedForTeamA(RedCardForTeamA);
    }

    public void YellowCardForTeamA(View v) {
        YellowCardForTeamA++;
        displayYellowForTeamA(YellowCardForTeamA);
    }

    public void GoalForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void RedCardForTeamB(View v) {
        RedCardForTeamB++;
        displayRedForTeamB(RedCardForTeamB);
    }

    public void YellowCardForTeamB(View v) {
        YellowCardForTeamB++;
        displayYellowForTeamB(YellowCardForTeamB);
    }


    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        RedCardForTeamA = 0;
        RedCardForTeamB = 0;
        displayRedForTeamA(RedCardForTeamA);
        displayRedForTeamB(RedCardForTeamB);
        YellowCardForTeamA = 0;
        YellowCardForTeamB = 0;
        displayYellowForTeamA(YellowCardForTeamA);
        displayYellowForTeamB(YellowCardForTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red cards for Team A.
     */
    public void displayRedForTeamA(int RedCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(RedCard));
    }

    /**
     * Displays the number of red cards for Team B.
     */
    public void displayRedForTeamB(int RedCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(RedCard));
    }


    /**
     * Displays the number of yellow cards for Team A.
     */
    public void displayYellowForTeamA(int YellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(YellowCard));
    }

    /**
     * Displays the number of yellow cards for Team B.
     */
    public void displayYellowForTeamB(int YellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(YellowCard));
    }
}





