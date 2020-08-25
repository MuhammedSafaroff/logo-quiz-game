package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DogruYanlisResultActivity extends AppCompatActivity {
    Context context=this;
    TextView oyunDYResultsonuc,oyunDYResulteniyi;
    ImageButton oyunDYresultyenidendenebtn,oyunDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogru_yanlis_result);
        init();
        oyunDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("oyunDYpuan",0));
        if (dataHelper.receiveDataInt("oyunDYeniyi",0)<dataHelper.receiveDataInt("oyunDYpuan",0)){
            dataHelper.saveDataInt("oyunDYeniyi",dataHelper.receiveDataInt("oyunDYpuan",0));
        }
        oyunDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("oyunDYeniyi",0));

        oyunDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,DogruYanlisActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyunDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyunDYResultsonuc=(TextView) findViewById(R.id.oyunDYResultsonuc);
        oyunDYResulteniyi=(TextView) findViewById(R.id.oyunDYResulteniyi);
        oyunDYresultyenidendenebtn=(ImageButton) findViewById(R.id.oyunDYresultyenidendenebtn);
        oyunDYresulthomebtn=(ImageButton) findViewById(R.id.oyunDYresulthomebtn);
    }
}
