package com.test.fifthgrademath;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class QuizResultActivity extends AppCompatActivity
{
    TextView txtScore, txtResult, txtGreetings;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        intiActionBar();

        txtScore = (TextView)findViewById(R.id.txtScore);
        txtResult = (TextView)findViewById(R.id.txtResult);
        txtGreetings = (TextView)findViewById(R.id.txtGreetings);

        int score = getIntent().getExtras().getInt("result",0);
        txtScore.setText("Score : " + score);
        blinkText();
        if(score <5)
        {
            txtScore.setTextColor(Color.RED);
            txtResult.setText("Fail");
            txtGreetings.setText("Bad Luck!!!");
        }
        else
        {
            txtScore.setTextColor(Color.GREEN);
            txtResult.setText("Pass");
            txtGreetings.setText("Congratulation!!!");
        }
    }

    private void intiActionBar()
    {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.trophy);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }

    private void blinkText(){

        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(50);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        txtGreetings.setAnimation(anim);
    }
}
