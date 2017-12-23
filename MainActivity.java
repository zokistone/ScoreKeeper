package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    static final String GOALS_TEAM_A_VALUE = "scoreA";
    static final String FOULS_TEAM_A_VALUE = "foulsA";

    static final String GOALS_TEAM_B_VALUE = "scoreB";
    static final String FOULS_TEAM_B_VALUE = "foulsB";

    int goalsTeamA = 0;
    int foulsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamB = 0;

    TextView team_a_goals;
    TextView team_a_fouls;
    TextView team_b_goals;
    TextView team_b_fouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team_a_goals = (TextView) findViewById(R.id.team_a_goals);
        team_a_fouls = (TextView) findViewById(R.id.team_a_fouls);
        team_b_goals = (TextView) findViewById(R.id.team_b_goals);
        team_b_fouls = (TextView) findViewById(R.id.team_b_fouls);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(GOALS_TEAM_A_VALUE, goalsTeamA);
        savedInstanceState.putInt(FOULS_TEAM_A_VALUE, foulsTeamA);
        savedInstanceState.putInt(GOALS_TEAM_B_VALUE, goalsTeamB);
        savedInstanceState.putInt(FOULS_TEAM_B_VALUE, foulsTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        goalsTeamA = savedInstanceState.getInt(GOALS_TEAM_A_VALUE);
        displayGoalsForTeamA(goalsTeamA);
        foulsTeamA = savedInstanceState.getInt(FOULS_TEAM_A_VALUE);
        displayFoulsForTeamA(foulsTeamA);
        goalsTeamB = savedInstanceState.getInt(GOALS_TEAM_B_VALUE);
        displayGoalsForTeamB(goalsTeamB);
        foulsTeamB = savedInstanceState.getInt(FOULS_TEAM_B_VALUE);
        displayFoulsForTeamB(foulsTeamB);
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
