package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class BirAd4SekilResultActivity extends AppCompatActivity {

    Context context=this;
    TextView oyun1A4SResultsonuc,oyun1A4SResulteniyi;
    ImageButton oyun1A4Sresultyenidendenebtn,oyun1A4Sresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir_ad4_sekil_result);
        init();
        oyun1A4SResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("oyun1A4Spuan",0));
        if (dataHelper.receiveDataInt("oyun1A4Seniyi",0)<dataHelper.receiveDataInt("oyun1A4Spuan",0)){
            dataHelper.saveDataInt("oyun1A4Seniyi",dataHelper.receiveDataInt("oyun1A4Spuan",0));
        }
        oyun1A4SResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("oyun1A4Seniyi",0));

        oyun1A4Sresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,BirAd4SekilActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyun1A4Sresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyun1A4SResultsonuc=(TextView) findViewById(R.id.oyun1A4SResultsonuc);
        oyun1A4SResulteniyi=(TextView) findViewById(R.id.oyun1A4SResulteniyi);
        oyun1A4Sresultyenidendenebtn=(ImageButton) findViewById(R.id.oyun1A4Sresultyenidendenebtn);
        oyun1A4Sresulthomebtn=(ImageButton) findViewById(R.id.oyun1A4Sresulthomebtn);
    }
}
