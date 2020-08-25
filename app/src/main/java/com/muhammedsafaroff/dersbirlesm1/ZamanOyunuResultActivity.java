package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ZamanOyunuResultActivity extends AppCompatActivity {
    Context context=this;
    TextView oyunZKResultsonuc,oyunZKResulteniyi;
    ImageButton oyunZKresultyenidendenebtn,oyunZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaman_oyunu_result);
        init();
        oyunZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("oyunZKpuan",0));
        if (dataHelper.receiveDataInt("oyunZKeniyi",0)<dataHelper.receiveDataInt("oyunZKpuan",0)){
            dataHelper.saveDataInt("oyunZKeniyi",dataHelper.receiveDataInt("oyunZKpuan",0));
        }
        oyunZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("oyunZKeniyi",0));

        oyunZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,ZamanOyunuActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyunZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyunZKResultsonuc=(TextView) findViewById(R.id.oyunZKResultsonuc);
        oyunZKResulteniyi=(TextView) findViewById(R.id.oyunZKResulteniyi);
        oyunZKresultyenidendenebtn=(ImageButton) findViewById(R.id.oyunZKresultyenidendenebtn);
        oyunZKresulthomebtn=(ImageButton) findViewById(R.id.oyunZKresulthomebtn);
    }
}
