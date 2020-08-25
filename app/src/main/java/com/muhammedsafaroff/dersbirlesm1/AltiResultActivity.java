package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView oyunAltiResultsonuc,oyunAltiResulteniyi;
    ImageButton oyunAltiresultyenidendenebtn,oyunAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alti_result);
        init();
        oyunAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("oyunAltipuan",0));
        if (dataHelper.receiveDataInt("oyunAltieniyi",0)<dataHelper.receiveDataInt("oyunAltipuan",0)){
            dataHelper.saveDataInt("oyunAltieniyi",dataHelper.receiveDataInt("oyunAltipuan",0));
        }
        oyunAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("oyunAltieniyi",0));

        oyunAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        oyunAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        oyunAltiResultsonuc=(TextView) findViewById(R.id.oyunAltiResultsonuc);
        oyunAltiResulteniyi=(TextView) findViewById(R.id.oyunAltiResulteniyi);
        oyunAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.oyunAltiresultyenidendenebtn);
        oyunAltiresulthomebtn=(ImageButton) findViewById(R.id.oyunAltiresulthomebtn);
    }
}
