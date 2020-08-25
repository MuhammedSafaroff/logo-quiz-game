package com.muhammedsafaroff.dersbirlesm1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    Context context=this;
    Typeface font;
    TextView girisbasliq;
    RelativeLayout birSekil4Adbtn,birAd4Sekilbtn,DogruYanlisbtn,Altibtn,ZamanOyunubtn,YazilimSorusubtn;
    TextView birSekil4Adbasliq,birAd4Sekilbasliq,DogruYanlisbasliq,Altibasliq,ZamanOyunubasliq,YazilimSorusubasliq;
    TextView birSekil4AdEniyi,birAd4SekilEniyi,DogruYanlisEniyi,AltiEniyi,ZamanOyunuEniyi,YazilimSorusuEniyi;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        WindowManager windowManager=(WindowManager)getApplicationContext().getSystemService(context.WINDOW_SERVICE);
        Display ekran = windowManager.getDefaultDisplay();
        int textsize=ekran.getWidth()/41-2;
        birSekil4Adbasliq.setTextSize(textsize);
        birAd4Sekilbasliq.setTextSize(textsize);
        DogruYanlisbasliq.setTextSize(textsize);
        Altibasliq.setTextSize(textsize);
        ZamanOyunubasliq.setTextSize(textsize);
        YazilimSorusubasliq.setTextSize(textsize);


        birSekil4AdEniyi.setText(String.valueOf(dataHelper.receiveDataInt("oyun1S4Aeniyi",0)));
        birAd4SekilEniyi.setText(String.valueOf(dataHelper.receiveDataInt("oyun1A4Seniyi",0)));
        DogruYanlisEniyi.setText(String.valueOf(dataHelper.receiveDataInt("oyunDYeniyi",0)));
        AltiEniyi.setText(String.valueOf(dataHelper.receiveDataInt("oyunAltieniyi",0)));
        ZamanOyunuEniyi.setText(String.valueOf(dataHelper.receiveDataInt("oyunZKeniyi",0)));
        YazilimSorusuEniyi.setText(String.valueOf(dataHelper.receiveDataInt("quizeniyi",0)));
        


        birSekil4Adbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,BirSekil4AdActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        birAd4Sekilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,BirAd4SekilActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        DogruYanlisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,DogruYanlisActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        Altibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        ZamanOyunubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,ZamanOyunuActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        YazilimSorusubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,QuizActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
    }

    public void init(){
        girisbasliq = (TextView) findViewById(R.id.girisbasliq);
        birSekil4Adbtn = (RelativeLayout) findViewById(R.id.birSekil4Adbtn);
        birAd4Sekilbtn = (RelativeLayout) findViewById(R.id.birAd4Sekilbtn);
        DogruYanlisbtn = (RelativeLayout) findViewById(R.id.DogruYanlisbtn);
        Altibtn = (RelativeLayout) findViewById(R.id.Altibtn);
        ZamanOyunubtn = (RelativeLayout) findViewById(R.id.ZamanOyunubtn);
        YazilimSorusubtn = (RelativeLayout) findViewById(R.id.YazilimSorusubtn);

        birSekil4Adbasliq = (TextView) findViewById(R.id.birSekil4Adbasliq);
        birAd4Sekilbasliq = (TextView) findViewById(R.id.birAd4Sekilbasliq);
        DogruYanlisbasliq = (TextView) findViewById(R.id.DogruYanlisbasliq);
        Altibasliq = (TextView) findViewById(R.id.Altibasliq);
        ZamanOyunubasliq = (TextView) findViewById(R.id.ZamanOyunubasliq);
        YazilimSorusubasliq = (TextView) findViewById(R.id.YazilimSorusubasliq);

        birSekil4AdEniyi = (TextView) findViewById(R.id.birSekil4AdEniyi);
        birAd4SekilEniyi = (TextView) findViewById(R.id.birAd4SekilEniyi);
        DogruYanlisEniyi = (TextView) findViewById(R.id.DogruYanlisEniyi);
        AltiEniyi = (TextView) findViewById(R.id.AltiEniyi);
        ZamanOyunuEniyi = (TextView) findViewById(R.id.ZamanOyunuEniyi);
        YazilimSorusuEniyi = (TextView) findViewById(R.id.YazilimSorusuEniyi);



        font = Typeface.createFromAsset(getAssets(),"fonts/FredokaOneRegular.ttf");
        girisbasliq.setTypeface(font);
    }

    private void reklam(){
        //reklam

        MobileAds.initialize(this,
                "ca-app-pub-4763830311171299~4846897453");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
                super.onAdLoaded();
            }
        });

    }
}
