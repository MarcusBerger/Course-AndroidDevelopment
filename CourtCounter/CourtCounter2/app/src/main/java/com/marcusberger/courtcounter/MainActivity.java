package com.marcusberger.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View v){

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void more3(View view) {
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);

    }

    public void more3b(View view) {
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);

    }

    public void more2(View view) {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    public void more2b(View view) {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    public void frow(View view) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void frowb(View view) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

}
