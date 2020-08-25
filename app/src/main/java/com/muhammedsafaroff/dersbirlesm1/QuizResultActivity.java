package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizResultActivity extends AppCompatActivity {
    Context context=this;
    TextView oyunQuizResultsonuc,oyunQuizResulteniyi;
    ImageButton oyunQuizresultyenidendenebtn,oyunQuizresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        init();
        oyunQuizResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("quizpuan",0));
        if (dataHelper.receiveDataInt("quizeniyi",0)<dataHelper.receiveDataInt("quizpuan",0)){
            dataHelper.saveDataInt("quizeniyi",dataHelper.receiveDataInt("quizpuan",0));
        }
        oyunQuizResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("quizeniyi",0));

        oyunQuizresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,QuizActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyunQuizresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyunQuizResultsonuc=(TextView) findViewById(R.id.oyunQuizResultsonuc);
        oyunQuizResulteniyi=(TextView) findViewById(R.id.oyunQuizResulteniyi);
        oyunQuizresultyenidendenebtn=(ImageButton) findViewById(R.id.oyunQuizresultyenidendenebtn);
        oyunQuizresulthomebtn=(ImageButton) findViewById(R.id.oyunQuizresulthomebtn);
    }
}
