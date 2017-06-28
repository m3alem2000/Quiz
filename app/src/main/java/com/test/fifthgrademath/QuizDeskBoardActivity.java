package com.test.fifthgrademath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QuizDeskBoardActivity extends AppCompatActivity
{

    Button btnStart;
    Button btnInstruction;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_desk_board);

        intiActionBar();
    }

    private void intiActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.trophy);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }

    public void startTest(View view){
        final Intent intentMain = new Intent(this,QuizMainActivity.class);
        startActivity(intentMain);
    }
}
