package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int foulsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void team_a_goals(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    public void team_a_fouls(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    public void  team_b_goals (View v){
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    public void  team_b_fouls (View v){
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }


    public void resetScore(View v){
        goalsTeamA = 0;
        foulsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayFoulsForTeamB(foulsTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int goalsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(goalsTeamA));
    }

    public void displayFoulsForTeamA(int foulsTeamA){
    TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(foulsTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsForTeamB(int goalsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(goalsTeamB));

    }
    public void displayFoulsForTeamB(int foulsTeamB){
        TextView scoreView = (TextView) findViewById((R.id.team_b_fouls));
        scoreView.setText(String.valueOf(foulsTeamB));

    }
}
