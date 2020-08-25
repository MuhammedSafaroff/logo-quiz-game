package com.muhammedsafaroff.dersbirlesm1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class BirAd4SekilActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan,sekilad,variant2,variant3,variant4,linearrand,btnrand,sayi;
    TextView oyun1A4Spuan,oyun1A4Sisim;
    ImageView oyun1A4Scan1,oyun1A4Scan2,oyun1A4Scan3;
    LinearLayout oyun1A4Slinear;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir_ad4_sekil);
        init();
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final int sekilArray[]=new int[]{R.drawable.aardman,R.drawable.abbott_detroit,R.drawable.access,R.drawable.access_,R.drawable.acrobat,R.drawable.acura,R.drawable.adidas,R.drawable.adobe,R.drawable.adobe_bridge,R.drawable.adobe_lightroom,R.drawable.adsense,R.drawable.adwords,R.drawable.after_effects,R.drawable.aim,R.drawable.air,R.drawable.air_bnb,R.drawable.air_canada,R.drawable.air_china,R.drawable.air_newzealand,R.drawable.amazon,R.drawable.amd,R.drawable.american_airlines,R.drawable.american_motors,R.drawable.android,R.drawable.animate,R.drawable.anywhere,R.drawable.app_net,R.drawable.app_store,R.drawable.apple,R.drawable.asphalt,R.drawable.atari,R.drawable.ati,R.drawable.auburn,R.drawable.audi,R.drawable.audition,R.drawable.badoo,R.drawable.baidu,R.drawable.bangkok_airways,R.drawable.basecamp,R.drawable.baskin_robbins,R.drawable.batman,R.drawable.beat,R.drawable.beats,R.drawable.beats_pill,R.drawable.behance,R.drawable.bentley,R.drawable.bimota,R.drawable.bing,R.drawable.blackberry,R.drawable.blogger,R.drawable.bmw,R.drawable.boeing,R.drawable.bp,R.drawable.brammo,R.drawable.bridge,R.drawable.brightkite,R.drawable.british_airways,R.drawable.buick,R.drawable.c,R.drawable.cadillac,R.drawable.capture,R.drawable.cartoon_network,R.drawable.cbs,R.drawable.century_fox,R.drawable.character_animator,R.drawable.chevrolet,R.drawable.chevrolet_corvette,R.drawable.chrome,R.drawable.citroen,R.drawable.clash_of_clans,R.drawable.cloud,R.drawable.coderwall,R.drawable.coldfusion,R.drawable.cole,R.drawable.columbia,R.drawable.comedy_central,R.drawable.common_lisp,R.drawable.comp,R.drawable.composer,R.drawable.counter_strike,R.drawable.cpp,R.drawable.creative_cloud,R.drawable.creative_market,R.drawable.crm,R.drawable.css3,R.drawable.cw,R.drawable.daelim,R.drawable.dairy_queen,R.drawable.danish_air_transport,R.drawable.dc,R.drawable.delorean,R.drawable.delta_airlines,R.drawable.delve,R.drawable.desoto,R.drawable.detroit_electric,R.drawable.deviantart,R.drawable.dimension,R.drawable.discord,R.drawable.discovery,R.drawable.disqus,R.drawable.docker,R.drawable.dodge_viper,R.drawable.dolby,R.drawable.dominos_s,R.drawable.dove,R.drawable.dreamweaver,R.drawable.dreamworks,R.drawable.dribbble,R.drawable.dropbox,R.drawable.drupal,R.drawable.duesenberg,R.drawable.eagle,R.drawable.edge,R.drawable.edsel,R.drawable.electronics_arts,R.drawable.ello,R.drawable.emirates,R.drawable.encore,R.drawable.espn,R.drawable.evernote,R.drawable.excel,R.drawable.experience,R.drawable.extension_manager,R.drawable.facebook,R.drawable.faraday_future,R.drawable.feedburner,R.drawable.fiat,R.drawable.fill_sign,R.drawable.finder,R.drawable.firefox,R.drawable.firestone,R.drawable.fisker,R.drawable.fiverr,R.drawable.flashbuilder,R.drawable.flickr,R.drawable.flipboard,R.drawable.ford,R.drawable.ford_mustang,R.drawable.forrst,R.drawable.abbott_detroit,R.drawable.foursquare,R.drawable.franklin,R.drawable.fuse,R.drawable.gaming_sdk,R.drawable.general_electric,R.drawable.general_motors,R.drawable.geo,R.drawable.github,R.drawable.gmail,R.drawable.gnu_bash,R.drawable.go_lang,R.drawable.google,R.drawable.google_account,R.drawable.google_admob,R.drawable.google_allo,R.drawable.google_analytics,R.drawable.google_application,R.drawable.google_calendar,R.drawable.google_drive,R.drawable.google_duo,R.drawable.google_earth,R.drawable.google_for_education,R.drawable.google_keep,R.drawable.google_location,R.drawable.google_maps,R.drawable.google_play,R.drawable.google_play_movies,R.drawable.google_play_music,R.drawable.google_plus,R.drawable.groove_music,R.drawable.grooveshark,R.drawable.groupon,R.drawable.hangouts,R.drawable.harry_potter,R.drawable.haskell,R.drawable.hayday,R.drawable.hennessey,R.drawable.hero,R.drawable.hewlett_packard,R.drawable.holden,R.drawable.honda,R.drawable.houzz,R.drawable.html5,R.drawable.hudson,R.drawable.husqvarna,R.drawable.hyosung,R.drawable.hyundai,R.drawable.iberia,R.drawable.ibooks,R.drawable.ic_bus,R.drawable.icloud,R.drawable.illustrator,R.drawable.illustratordraw,R.drawable.imo,R.drawable.in_copy,R.drawable.inbox,R.drawable.indesign,R.drawable.infiniti,R.drawable.infopath,R.drawable.internet_explorer,R.drawable.itunes,R.drawable.jaguar,R.drawable.jamboard,R.drawable.japan_airlines,R.drawable.javascript,R.drawable.jetpunk,R.drawable.kaiser,R.drawable.karma,R.drawable.kenworth,R.drawable.kfc,R.drawable.kia,R.drawable.kickstarter,R.drawable.kik,R.drawable.klm,R.drawable.ktm,R.drawable.kymco,R.drawable.lacoste,R.drawable.lastfm,R.drawable.lexus,R.drawable.lightroom,R.drawable.lincoln,R.drawable.line,R.drawable.linkedin,R.drawable.lisp,R.drawable.lync,R.drawable.mail_ru,R.drawable.malaysia_airlines,R.drawable.mazda,R.drawable.mcdonalds,R.drawable.media_encoder,R.drawable.mercedes_benz,R.drawable.mercury,R.drawable.messenger,R.drawable.microsoft,R.drawable.mini,R.drawable.mitsubishi,R.drawable.monster,R.drawable.mosler,R.drawable.motorola,R.drawable.movies_tv,R.drawable.mozilla,R.drawable.msn,R.drawable.mtv,R.drawable.muse,R.drawable.mustwatch,R.drawable.my_business,R.drawable.myspace,R.drawable.national_geographic,R.drawable.nbc,R.drawable.nestle,R.drawable.netflix,R.drawable.news_feed,R.drawable.nickelodeon,R.drawable.nike,R.drawable.notebook,R.drawable.nvidia,R.drawable.nyx,R.drawable.odnoklassniki,R.drawable.office,R.drawable.office_application,R.drawable.office_store,R.drawable.oldsmobile,R.drawable.one_drive,R.drawable.one_note,R.drawable.opel,R.drawable.open_source,R.drawable.opera,R.drawable.outlook,R.drawable.overflowing,R.drawable.packard,R.drawable.pandora,R.drawable.paramount,R.drawable.path,R.drawable.paypal,R.drawable.pbs,R.drawable.people,R.drawable.pepsi,R.drawable.periscope,R.drawable.petrochina,R.drawable.peugeot,R.drawable.phonegap_build,R.drawable.photos,R.drawable.photoshop,R.drawable.photoshop_elements,R.drawable.photoshop_express,R.drawable.photoshop_fix,R.drawable.photoshop_mix,R.drawable.photoshop_sketch,R.drawable.piaggio,R.drawable.picasa,R.drawable.pierce_arrow,R.drawable.pizzahut,R.drawable.planner,R.drawable.play_store,R.drawable.playstation,R.drawable.plymouth,R.drawable.pocket,R.drawable.point_blank,R.drawable.pontiac,R.drawable.porto,R.drawable.post,R.drawable.postscript,R.drawable.power,R.drawable.powerbl,R.drawable.powerpoint,R.drawable.prelude,R.drawable.premier,R.drawable.premiere,R.drawable.premiere_clip,R.drawable.premiere_elements,R.drawable.preview,R.drawable.pringles,R.drawable.project,R.drawable.project_felix,R.drawable.pubg,R.drawable.publisher,R.drawable.puma,R.drawable.python,R.drawable.qantas,R.drawable.quicktime,R.drawable.quora,R.drawable.ram,R.drawable.rambler,R.drawable.raspberry_pi,R.drawable.react,R.drawable.reddit,R.drawable.renault,R.drawable.retrica,R.drawable.rezvani,R.drawable.rolex,R.drawable.roxy,R.drawable.rss,R.drawable.ruby,R.drawable.s_health,R.drawable.safari,R.drawable.saga,R.drawable.samsung_internet,R.drawable.sao_paulo,R.drawable.saturn,R.drawable.scala,R.drawable.scout,R.drawable.sharepoint,R.drawable.shazam,R.drawable.shell,R.drawable.shutterstock,R.drawable.simple,R.drawable.singapore_airlines,R.drawable.sketch,R.drawable.skype,R.drawable.slack,R.drawable.slideshare,R.drawable.smart,R.drawable.smartphone,R.drawable.smugmug,R.drawable.snapchat,R.drawable.snapseed,R.drawable.solo,R.drawable.sony,R.drawable.sony_vaio,R.drawable.soundcloud,R.drawable.spark,R.drawable.spark_page,R.drawable.speed_grade,R.drawable.ssc,R.drawable.starbucks,R.drawable.sterling,R.drawable.stock,R.drawable.story,R.drawable.studebaker,R.drawable.studio_ghibli,R.drawable.stumbleupon,R.drawable.stutz,R.drawable.subaru,R.drawable.subway,R.drawable.superman,R.drawable.surface,R.drawable.suzuki,R.drawable.swarm,R.drawable.sway,R.drawable.swift,R.drawable.swiftify,R.drawable.switch_,R.drawable.sym_motor,R.drawable.tacobell,R.drawable.target,R.drawable.tasks,R.drawable.teams,R.drawable.telegram,R.drawable.tesla,R.drawable.thai,R.drawable.the_flash,R.drawable.the_olympic_rings,R.drawable.tiktok,R.drawable.tinder,R.drawable.tipekit,R.drawable.tokyo,R.drawable.toyota,R.drawable.translate,R.drawable.trello,R.drawable.tripadvisor,R.drawable.tucker,R.drawable.tumblr,R.drawable.turkish_airlines,R.drawable.turner,R.drawable.tvs,R.drawable.twitch,R.drawable.twitter,R.drawable.typescript,R.drawable.uber,R.drawable.underground,R.drawable.unilever,R.drawable.univision,R.drawable.utorrent,R.drawable.vault,R.drawable.vespa,R.drawable.viber,R.drawable.vic,R.drawable.video,R.drawable.vine,R.drawable.visio,R.drawable.visual_basic,R.drawable.visual_studio,R.drawable.vivavideo,R.drawable.vkontakte,R.drawable.vlf,R.drawable.volkswagen,R.drawable.vsco,R.drawable.waze,R.drawable.webhook,R.drawable.wechat,R.drawable.western_star,R.drawable.whatsapp,R.drawable.wikipedia,R.drawable.willys_overland,R.drawable.windows_7,R.drawable.windows_8,R.drawable.windows_media_player,R.drawable.wonder_woman,R.drawable.word,R.drawable.work,R.drawable.wrench,R.drawable.xbox,R.drawable.xerox,R.drawable.xiamen_air,R.drawable.xiaomi,R.drawable.yamaha,R.drawable.yammer,R.drawable.yelp,R.drawable.youtube,R.drawable.zoom,R.drawable.zune};
        final String adArray[]=new String[]{"AARDMAN","ABBOTT DETROIT","ACCESS","ACCESS","ACROBAT","ACURA","ADIDAS","ADOBE","ADOBE BRIDGE","ADOBE LIGHTROOM","ADSENSE","ADWORDS","AFTER EFFECTS","AIM","AIR","AIR BNB","AIR CANADA","AIR CHINA","AIR NEWZEALAND","AMAZON","AMD","AMERICAN AIRLINES","AMERICAN MOTORS","ANDROID","ANIMATE","ANYWHERE","APP NET","APP STORE","APPLE","ASPHALT","ATARI","ATI","AUBURN","AUDI","AUDITION","BADOO","BAIDU","BANGKOK AIRWAYS","BASECAMP","BASKIN ROBBINS","BATMAN","BEAT","BEATS","BEATS PILL","BEHANCE","BENTLEY","BIMOTA","BING","BLACKBERRY","BLOGGER","BMW","BOEING","BP","BRAMMO","BRIDGE","BRIGHTKITE","BRITISH AIRWAYS","BUICK","C","CADILLAC","CAPTURE","CARTOON NETWORK","CBS","CENTURY FOX","CHARACTER ANIMATOR","CHEVROLET","CHEVROLET CORVETTE","CHROME","CITROEN","CLASH OF CLANS","CLOUD","CODERWALL","COLDFUSION","COLE","COLUMBIA","COMEDY CENTRAL","COMMON LISP","COMP","COMPOSER","COUNTER STRIKE","C++","CREATIVE CLOUD","CREATIVE MARKET","CRM","CSS 3","CW","DAELIM","DAIRY QUEEN","DANISH AIR TRANSPORT","DC","DELOREAN","DELTA AIRLINES","DELVE","DESOTO","DETROIT ELECTRIC","DEVIANTART","DIMENSION","DISCORD","DISCOVERY","DISQUS","DOCKER","DODGE VIPER","DOLBY","DOMINOS'S","DOVE","DREAMWEAVER","DREAMWORKS","DRIBBBLE","DROPBOX","DRUPAL","DUESENBERG","EAGLE","EDGE","EDSEL","ELECTRONICS ARTS","ELLO","EMIRATES","ENCORE","ESPN","EVERNOTE","EXCEL","EXPERIENCE","EXTENSION MANAGER","FACEBOOK","FARADAY FUTURE","FEEDBURNER","FIAT","FILL SIGN","FINDER","FIREFOX","FIRESTONE","FISKER","FIVERR","FLASHBUILDER","FLICKR","FLIPBOARD","FORD","FORD MUSTANG","FORRST","ABBOTT DETROIT","FOURSQUARE","FRANKLIN","FUSE","GAMING SDK","GENERAL ELECTRIC","GENERAL MOTORS","GEO","GITHUB","GMAIL","GNU BASH","GO LANG","GOOGLE","GOOGLE ACCOUNT","GOOGLE ADMOB","GOOGLE ALLO","GOOGLE ANALYTICS","GOOGLE APPLICATION","GOOGLE CALENDAR","GOOGLE DRIVE","GOOGLE DUO","GOOGLE EARTH","GOOGLE FOR EDUCATION","GOOGLE KEEP","GOOGLE LOCATION","GOOGLE MAPS","GOOGLE PLAY","GOOGLE PLAY MOVIES","GOOGLE PLAY MUSIC","GOOGLE PLUS","GROOVE MUSIC","GROOVESHARK","GROUPON","HANGOUTS","HARRY POTTER","HASKELL","HAYDAY","HENNESSEY","HERO","HEWLETT PACKARD","HOLDEN","HONDA","HOUZZ","HTML 5","HUDSON","HUSQVARNA","HYOSUNG","HYUNDAI","IBERIA","IBOOKS","IC BUS","ICLOUD","ILLUSTRATOR","ILLUSTRATORDRAW","IMO","IN COPY","INBOX","INDESIGN","INFINITI","INFOPATH","INTERNET EXPLORER","ITUNES","JAGUAR","JAMBOARD","JAPAN AIRLINES","JAVASCRIPT","JETPUNK","KAISER","KARMA","KENWORTH","KFC","KIA","KICKSTARTER","KIK","KLM","KTM","KYMCO","LACOSTE","LASTFM","LEXUS","LIGHTROOM","LINCOLN","LINE","LINKEDIN","LISP","LYNC","MAIL.RU","MALAYSIA AIRLINES","MAZDA","MCDONALDS","MEDIA ENCODER","MERCEDES BENZ","MERCURY","MESSENGER","MICROSOFT","MINI","MITSUBISHI","MONSTER","MOSLER","MOTOROLA","MOVIES TV","MOZILLA","MSN","MTV","MUSE","MUSTWATCH","MY BUSINESS","MYSPACE","NATIONAL GEOGRAPHIC","NBC","NESTLE","NETFLIX","NEWS FEED","NICKELODEON","NIKE","NOTEBOOK","NVIDIA","NYX","ODNOKLASSNIKI","OFFICE","OFFICE APPLICATION","OFFICE STORE","OLDSMOBILE","ONE DRIVE","ONE NOTE","OPEL","OPEN SOURCE","OPERA","OUTLOOK","OVERFLOWING","PACKARD","PANDORA","PARAMOUNT","PATH","PAYPAL","PBS","PEOPLE","PEPSI","PERISCOPE","PETROCHINA","PEUGEOT","PHONEGAP BUILD","PHOTOS","PHOTOSHOP","PHOTOSHOP ELEMENTS","PHOTOSHOP EXPRESS","PHOTOSHOP FIX","PHOTOSHOP MIX","PHOTOSHOP SKETCH","PIAGGIO","PICASA","PIERCE ARROW","PIZZAHUT","PLANNER","PLAY STORE","PLAYSTATION","PLYMOUTH","POCKET","POINT BLANK","PONTIAC","PORTO","POST","POSTSCRIPT","POWER","POWERBL","POWERPOINT","PRELUDE","PREMIER","PREMIERE","PREMIERE CLIP","PREMIERE ELEMENTS","PREVIEW","PRINGLES","PROJECT","PROJECT FELIX","PUBG","PUBLISHER","PUMA","PYTHON","QANTAS","QUICKTIME","QUORA","RAM","RAMBLER","RASPBERRY PI","REACT","REDDIT","RENAULT","RETRICA","REZVANI","ROLEX","ROXY","RSS","RUBY","S HEALTH","SAFARI","SAGA","SAMSUNG INTERNET","SAO PAULO","SATURN","SCALA","SCOUT","SHAREPOINT","SHAZAM","SHELL","SHUTTERSTOCK","SIMPLE","SINGAPORE AIRLINES","SKETCH","SKYPE","SLACK","SLIDESHARE","SMART","SMARTPHONE","SMUGMUG","SNAPCHAT","SNAPSEED","SOLO","SONY","SONY VAIO","SOUNDCLOUD","SPARK","SPARK PAGE","SPEED GRADE","SSC","STARBUCKS","STERLING","STOCK","STORY","STUDEBAKER","STUDIO GHIBLI","STUMBLEUPON","STUTZ","SUBARU","SUBWAY","SUPERMAN","SURFACE","SUZUKI","SWARM","SWAY","SWIFT","SWIFTIFY","SWITCH","SYM MOTOR","TACOBELL","TARGET","TASKS","TEAMS","TELEGRAM","TESLA","THAI","THE FLASH","THE OLYMPIC RINGS","TIKTOK","TINDER","TIPEKIT","TOKYO","TOYOTA","TRANSLATE","TRELLO","TRIPADVISOR","TUCKER","TUMBLR","TURKISH AIRLINES","TURNER","TVS","TWITCH","TWITTER","TYPESCRIPT","UBER","UNDERGROUND","UNILEVER","UNIVISION","UTORRENT","VAULT","VESPA","VIBER","VIC","VIDEO","VINE","VISIO","VISUAL BASIC","VISUAL STUDIO","VIVAVIDEO","VKONTAKTE","VLF","VOLKSWAGEN","VSCO","WAZE","WEBHOOK","WECHAT","WESTERN STAR","WHATSAPP","WIKIPEDIA","WILLYS OVERLAND","WINDOWS 7","WINDOWS 8","WINDOWS MEDIA PLAYER","WONDER WOMAN","WORD","WORK","WRENCH","XBOX","XEROX","XIAMEN AIR","XIAOMI","YAMAHA","YAMMER","YELP","YOUTUBE","ZOOM","ZUNE"};
        oyun1A4Spuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=sekilArray.length;
        dataHelper.saveDataInt("oyun1A4Spuan",0);
        //bas
        funk4b1u(sekilArray,adArray);
    }

    public void rand(int say){

        sekilad=random.nextInt(say);
        variant2=random.nextInt(say);
        variant3=random.nextInt(say);
        variant4=random.nextInt(say);

        if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
            sekilad=random.nextInt(say);
            variant2=random.nextInt(say);
            variant3=random.nextInt(say);
            variant4=random.nextInt(say);

            if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                sekilad=random.nextInt(say);
                variant2=random.nextInt(say);
                variant3=random.nextInt(say);
                variant4=random.nextInt(say);

                if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                    sekilad=random.nextInt(say);
                    variant2=random.nextInt(say);
                    variant3=random.nextInt(say);
                    variant4=random.nextInt(say);

                    if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                        sekilad=random.nextInt(say);
                        variant2=random.nextInt(say);
                        variant3=random.nextInt(say);
                        variant4=random.nextInt(say);

                        if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                            sekilad=random.nextInt(say);
                            variant2=random.nextInt(say);
                            variant3=random.nextInt(say);
                            variant4=random.nextInt(say);

                            if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                sekilad=random.nextInt(say);
                                variant2=random.nextInt(say);
                                variant3=random.nextInt(say);
                                variant4=random.nextInt(say);

                                if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                    sekilad=random.nextInt(say);
                                    variant2=random.nextInt(say);
                                    variant3=random.nextInt(say);
                                    variant4=random.nextInt(say);

                                    if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                        sekilad=random.nextInt(say);
                                        variant2=random.nextInt(say);
                                        variant3=random.nextInt(say);
                                        variant4=random.nextInt(say);

                                        if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                            sekilad=random.nextInt(say);
                                            variant2=random.nextInt(say);
                                            variant3=random.nextInt(say);
                                            variant4=random.nextInt(say);

                                            if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                sekilad=random.nextInt(say);
                                                variant2=random.nextInt(say);
                                                variant3=random.nextInt(say);
                                                variant4=random.nextInt(say);

                                                if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                    sekilad=random.nextInt(say);
                                                    variant2=random.nextInt(say);
                                                    variant3=random.nextInt(say);
                                                    variant4=random.nextInt(say);

                                                    if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                        sekilad=random.nextInt(say);
                                                        variant2=random.nextInt(say);
                                                        variant3=random.nextInt(say);
                                                        variant4=random.nextInt(say);

                                                        if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                            sekilad=random.nextInt(say);
                                                            variant2=random.nextInt(say);
                                                            variant3=random.nextInt(say);
                                                            variant4=random.nextInt(say);

                                                            if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                                sekilad=random.nextInt(say);
                                                                variant2=random.nextInt(say);
                                                                variant3=random.nextInt(say);
                                                                variant4=random.nextInt(say);

                                                                if (sekilad==variant2 || sekilad==variant3 || sekilad==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                                    sekilad=random.nextInt(say);
                                                                    variant2=random.nextInt(say);
                                                                    variant3=random.nextInt(say);
                                                                    variant4=random.nextInt(say);


                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

    }

    public void init(){
        oyun1A4Spuan = (TextView) findViewById(R.id.oyun1A4Spuan);
        oyun1A4Sisim = (TextView) findViewById(R.id.oyun1A4Sisim);
        oyun1A4Scan1 = (ImageView) findViewById(R.id.oyun1A4Scan1);
        oyun1A4Scan2 = (ImageView) findViewById(R.id.oyun1A4Scan2);
        oyun1A4Scan3 = (ImageView) findViewById(R.id.oyun1A4Scan3);
        oyun1A4Slinear = (LinearLayout) findViewById(R.id.oyun1A4Slinear);
    }

    public void funk4b1u(final int[] sekilArray1, final String[] adArray1){
        rand(sayi);
        linearrand=random.nextInt(4);
        btnrand=random.nextInt(4);
        oyun1A4Sisim.setText(adArray1[sekilad]);


        if (linearrand==0 || linearrand==2){

            LinearLayout lilayer1 = new LinearLayout(context);
            LinearLayout.LayoutParams params1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams params1_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            params1.weight=1;
            params1.setMargins(3,3,3,3);
            lilayer1.setLayoutParams(params1);
            //

            final LinearLayout libutton1_1 = new LinearLayout(context);
            libutton1_1.setLayoutParams(params1);
            libutton1_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton1_1.setClickable(true);
            libutton1_1.setPadding(10,10,10,10);
            libutton1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton1_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton1_1.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer1.addView(libutton1_1);

            ImageView img1_1=new ImageView(context);
            img1_1.setLayoutParams(params1_1);
            img1_1.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant2]));
            libutton1_1.addView(img1_1);

            //
            final LinearLayout libutton1_2 = new LinearLayout(context);
            libutton1_2.setLayoutParams(params1);
            libutton1_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton1_2.setClickable(true);
            libutton1_2.setPadding(10,10,10,10);
            libutton1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton1_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton1_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler2=new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer1.addView(libutton1_2);

            ImageView img1_2=new ImageView(context);
            img1_2.setLayoutParams(params1_1);
            img1_2.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant3]));
            libutton1_2.addView(img1_2);


            //
            oyun1A4Slinear.addView(lilayer1);

        }
//        yukari

        LinearLayout lilayer2 = new LinearLayout(context);
        LinearLayout.LayoutParams params2= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams params2_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        params2.weight=1;
        params2.setMargins(3,3,3,3);
        lilayer2.setLayoutParams(params2);
        //

        if (btnrand==0 || btnrand==2){
            final LinearLayout libutton2_2 = new LinearLayout(context);
            libutton2_2.setLayoutParams(params2);
            libutton2_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton2_2.setClickable(true);
            libutton2_2.setPadding(10,10,10,10);
            libutton2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton2_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler3=new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer2.addView(libutton2_2);

            ImageView img2_2=new ImageView(context);
            img2_2.setLayoutParams(params2_1);
            img2_2.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant4]));
            libutton2_2.addView(img2_2);
        }

        final LinearLayout libutton2_1 = new LinearLayout(context);
        libutton2_1.setLayoutParams(params2);
        libutton2_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
        libutton2_1.setClickable(true);
        libutton2_1.setPadding(10,10,10,10);
        libutton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puan++;
                oyun1A4Spuan.setText(getString(R.string.puan_yazi)+" "+puan);
                dataHelper.saveDataInt("oyun1A4Spuan",puan);
                libutton2_1.setEnabled(false);
                libutton2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                Handler handler7=new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        oyun1A4Slinear.removeAllViews();
                        funk4b1u(sekilArray1,adArray1);
                        //overridePendingTransition(R.anim.right_in,R.anim.left_out);

                    }
                },600);
            }
        });
        lilayer2.addView(libutton2_1);

        ImageView img2_1=new ImageView(context);
        img2_1.setLayoutParams(params2_1);
        img2_1.setImageDrawable(this.getResources().getDrawable(sekilArray1[sekilad]));
        libutton2_1.addView(img2_1);

        if (btnrand==1 || btnrand==3){
            final LinearLayout libutton2_3 = new LinearLayout(context);
            libutton2_3.setLayoutParams(params2);
            libutton2_3.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton2_3.setClickable(true);
            libutton2_3.setPadding(10,10,10,10);
            libutton2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton2_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton2_3.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler4=new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer2.addView(libutton2_3);

            ImageView img2_3=new ImageView(context);
            img2_3.setLayoutParams(params2_1);
            img2_3.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant4]));
            libutton2_3.addView(img2_3);
        }


        //
        oyun1A4Slinear.addView(lilayer2);




//        asagi
        if (linearrand==1 || linearrand==3){

            LinearLayout lilayer3 = new LinearLayout(context);
            LinearLayout.LayoutParams params3= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams params3_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            params3.weight=1;
            params3.setMargins(3,3,3,3);
            lilayer3.setLayoutParams(params3);
            //

            final LinearLayout libutton3_1 = new LinearLayout(context);
            libutton3_1.setLayoutParams(params3);
            libutton3_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton3_1.setClickable(true);
            libutton3_1.setPadding(10,10,10,10);
            libutton3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton3_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton3_1.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler5=new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer3.addView(libutton3_1);

            ImageView img3_1=new ImageView(context);
            img3_1.setLayoutParams(params3_1);
            img3_1.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant2]));
            libutton3_1.addView(img3_1);

            //
            final LinearLayout libutton3_2 = new LinearLayout(context);
            libutton3_2.setLayoutParams(params3);
            libutton3_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton3_2.setClickable(true);
            libutton3_2.setPadding(10,10,10,10);
            libutton3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton3_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(oyun1A4Scan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        oyun1A4Scan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler6=new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,BirAd4SekilResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer3.addView(libutton3_2);

            ImageView img3_2=new ImageView(context);
            img3_2.setLayoutParams(params3_1);
            img3_2.setImageDrawable(this.getResources().getDrawable(sekilArray1[variant3]));
            libutton3_2.addView(img3_2);


            //
            oyun1A4Slinear.addView(lilayer3);
        }
    }
}
