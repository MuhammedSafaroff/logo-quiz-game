package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class BirSekil4AdResultActivity extends AppCompatActivity {

    Context context=this;
    TextView oyun1S4AResultsonuc,oyun1S4AResulteniyi;
    ImageButton oyun1S4Aresultyenidendenebtn,oyun1S4Aresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir_sekil4_ad_result);
        init();
        oyun1S4AResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("oyun1S4Apuan",0));
        if (dataHelper.receiveDataInt("oyun1S4Aeniyi",0)<dataHelper.receiveDataInt("oyun1S4Apuan",0)){
            dataHelper.saveDataInt("oyun1S4Aeniyi",dataHelper.receiveDataInt("oyun1S4Apuan",0));
        }
        oyun1S4AResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("oyun1S4Aeniyi",0));

        oyun1S4Aresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,BirSekil4AdActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyun1S4Aresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyun1S4AResultsonuc=(TextView) findViewById(R.id.oyun1S4AResultsonuc);
        oyun1S4AResulteniyi=(TextView) findViewById(R.id.oyun1S4AResulteniyi);
        oyun1S4Aresultyenidendenebtn=(ImageButton) findViewById(R.id.oyun1S4Aresultyenidendenebtn);
        oyun1S4Aresulthomebtn=(ImageButton) findViewById(R.id.oyun1S4Aresulthomebtn);
    }
}
