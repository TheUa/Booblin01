package com.example.admin.booblin01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.aigestudio.wheelpicker.WheelPicker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Admin on 04.08.2016.
 */
public class SecondActivity extends AppCompatActivity implements WheelPicker.OnItemSelectedListener {

    private String KEY = "KEY";
    private String test;
    private DatabaseHelper databaseHelper;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerAdapterSecond adapter;
    private ArrayList setArchiveDB;
    private Intent intent;
    private Bundle extras;
    private String[] visky;
    private String[] vodka;
    private String[] beer;
    private String[] shot;
    private String[] biter;
    private String[] cola;
    private ArrayList entries = new ArrayList<>();
    private ImageView dropImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        dropImage = (ImageView) findViewById(R.id.dropImage);

        final Bundle extras = getIntent().getExtras();
        test = extras.getString(KEY);

        databaseHelper = new DatabaseHelper(this);
        visky = getResources().getStringArray(R.array.visky);
        vodka = getResources().getStringArray(R.array.vodka);
        beer = getResources().getStringArray(R.array.beer);
        shot = getResources().getStringArray(R.array.shot);
        biter = getResources().getStringArray(R.array.biter);
        cola = getResources().getStringArray(R.array.cola);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    if (extras != null) {
                        collapsingToolbarLayout.setTitle(test);
                    }

                    isShow = true;
                } else if (isShow) {
                    collapsingToolbarLayout.setTitle(" ");//carefull there should a space between double quote otherwise it wont work
                    isShow = false;
                }
            }
        });

        View fabClick = findViewById(R.id.fab_click);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerSecond);

        if (extras != null) {
            if (test.equals(visky[0])) {
                dropImage.setBackgroundResource(R.drawable.jameson);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JAMESON);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JAMESON);
                        return;
                    }
                });
            }
            if (test.equals(visky[1])) {
                dropImage.setBackgroundResource(R.drawable.bushmills);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS);
                        return;
                    }
                });
            }
            if (test.equals(visky[2])) {
                dropImage.setBackgroundResource(R.drawable.bushmills10);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS10);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS10);
                        return;
                    }
                });
            }
            if (test.equals(visky[3])) {
                dropImage.setBackgroundResource(R.drawable.bushmillsblack);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS_BLACK);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS_BLACK);
                        return;
                    }
                });
            }
            if (test.equals(visky[4])) {
                dropImage.setBackgroundResource(R.drawable.red);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_RED_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_RED_LABEL);
                        return;
                    }
                });
            }
            if (test.equals(visky[5])) {
                dropImage.setBackgroundResource(R.drawable.black);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BLACK_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BLACK_LABEL);
                        return;
                    }
                });
            }
            if (test.equals(visky[6])) {
                dropImage.setBackgroundResource(R.drawable.gold);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_GOLD_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_GOLD_LABEL);
                        return;
                    }
                });
            }
            if (test.equals(visky[7])) {
                dropImage.setBackgroundResource(R.drawable.bells);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BELLS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BELLS);
                        return;
                    }
                });
            }
            if (test.equals(visky[8])) {
                dropImage.setBackgroundResource(R.drawable.jack);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_DJACK_DANIELS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_DJACK_DANIELS);
                        return;
                    }
                });
            }
            if (test.equals(visky[9])) {
                dropImage.setBackgroundResource(R.drawable.single);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_DJACK_SINGLE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_DJACK_SINGLE);
                        return;
                    }
                });
            }
            if (test.equals(visky[10])) {
                dropImage.setBackgroundResource(R.drawable.singleton);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_SINGLETON);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_SINGLETON);
                        return;
                    }
                });
            }
            if (test.equals(visky[11])) {
                dropImage.setBackgroundResource(R.drawable.chivas);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_CHIWAS_REGAL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_CHIWAS_REGAL);
                        return;
                    }
                });
            }
            if (test.equals(vodka[0])) {
                dropImage.setBackgroundResource(R.drawable.nemiroff);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_NEMIROFF);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_NEMIROFF);
                        return;
                    }
                });
            }
            if (test.equals(vodka[1])) {
                dropImage.setBackgroundResource(R.drawable.lexx);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_NEMIROFF_LEXX);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_NEMIROFF_LEXX);
                        return;
                    }
                });
            }
            if (test.equals(vodka[2])) {
                dropImage.setBackgroundResource(R.drawable.nemoroff_hunny);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_NEMIROFF_PAPER);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_NEMIROFF_PAPER);
                        return;
                    }
                });
            }
            if (test.equals(vodka[3])) {
                dropImage.setBackgroundResource(R.drawable.grey_goose);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_GREY_GOOSE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_GREY_GOOSE);
                        return;
                    }
                });
            }
            if (test.equals(vodka[4])) {
                dropImage.setBackgroundResource(R.drawable.smirnoff);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_SMIRNOFF);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_SMIRNOFF);
                        return;
                    }
                });
            }
            if (test.equals(beer[0])) {
                dropImage.setBackgroundResource(R.drawable.guinness);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_GUINNESS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_GUINNESS);
                        return;
                    }
                });
            }
            if (test.equals(beer[1])) {
                dropImage.setBackgroundResource(R.drawable.kilkenny);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_KILKENNY);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_KILKENNY);
                        return;
                    }
                });
            }
            if (test.equals(beer[2])) {
                dropImage.setBackgroundResource(R.drawable.harp);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_HARP);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_HARP);
                        return;
                    }
                });
            }
            if (test.equals(beer[3])) {
                dropImage.setBackgroundResource(R.drawable.hoegaarden);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_HOEGAARDEN);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_HOEGAARDEN);
                        return;
                    }
                });
            }
            if (test.equals(beer[4])) {
                dropImage.setBackgroundResource(R.drawable.leffe_blond);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_LEFFE_BLONDE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_LEFFE_BLONDE);
                        return;
                    }
                });
            }
            if (test.equals(beer[5])) {
                dropImage.setBackgroundResource(R.drawable.leffe_brune);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_LEFFE_BRUNE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_LEFFE_BRUNE);
                        return;
                    }
                });
            }
            if (test.equals(beer[6])) {
                dropImage.setBackgroundResource(R.drawable.corona);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_CORONA_EXTRA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_CORONA_EXTRA);
                        return;
                    }
                });
            }
            if (test.equals(beer[7])) {
                dropImage.setBackgroundResource(R.drawable.warsteiner);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_WARSCHTAINER);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_WARSCHTAINER);
                        return;
                    }
                });
            }
            if (test.equals(shot[0])) {
                dropImage.setBackgroundResource(R.drawable.gordons);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_GORDONS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_GORDONS);
                        return;
                    }
                });
            }
            if (test.equals(shot[1])) {
                dropImage.setBackgroundResource(R.drawable.cuervo_silver);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JOSE_CUERVO_SILVER);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JOSE_CUERVO_SILVER);
                        return;
                    }
                });
            }
            if (test.equals(shot[2])) {
                dropImage.setBackgroundResource(R.drawable.cuervo_gold);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JOSE_CUERVO_GOLD);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JOSE_CUERVO_GOLD);
                        return;
                    }
                });
            }
            if (test.equals(shot[3])) {
                dropImage.setBackgroundResource(R.drawable.morgan_gold);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORGAN_GOLD);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORGAN_GOLD);
                        return;
                    }
                });
            }
            if (test.equals(shot[4])) {
                dropImage.setBackgroundResource(R.drawable.morgan_white);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORGAN_WHITE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORGAN_WHITE);
                        return;
                    }
                });
            }
            if (test.equals(shot[5])) {
                dropImage.setBackgroundResource(R.drawable.morgan_black);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORGAN_BLACK);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORGAN_BLACK);
                        return;
                    }
                });
            }
            if (test.equals(shot[6])) {
                dropImage.setBackgroundResource(R.drawable.morgan_spiced);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORGAN_SPICED);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORGAN_SPICED);
                        return;
                    }
                });
            }
            if (test.equals(biter[0])) {
                dropImage.setBackgroundResource(R.drawable.jager);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JAGERMEISTER);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JAGERMEISTER);
                        return;
                    }
                });
            }
            if (test.equals(biter[1])) {
                dropImage.setBackgroundResource(R.drawable.becher);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BECHEROVKA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BECHEROVKA);
                        return;
                    }
                });
            }
            if (test.equals(biter[2])) {
                dropImage.setBackgroundResource(R.drawable.martini_bainco);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MARTINI_BIANCO);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MARTINI_BIANCO);
                        return;
                    }
                });
            }
            if (test.equals(biter[3])) {
                dropImage.setBackgroundResource(R.drawable.martini_rosso);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MARTINI_ROSSO);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MARTINI_ROSSO);
                        return;
                    }
                });
            }
            if (test.equals(biter[4])) {
                dropImage.setBackgroundResource(R.drawable.martini_dry);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MARTINI_EXTRA_DRY);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MARTINI_EXTRA_DRY);
                        return;
                    }
                });
            }
            if (test.equals(biter[5])) {
                dropImage.setBackgroundResource(R.drawable.sambuca);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_SAMBUKA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_SAMBUKA);
                        return;
                    }
                });
            }
            if (test.equals(biter[6])) {
                dropImage.setBackgroundResource(R.drawable.pisang);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_PISANG);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_PISANG);
                        return;
                    }
                });
            }
            if (test.equals(biter[7])) {
                dropImage.setBackgroundResource(R.drawable.triple);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_TRIPLE_SEC);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_TRIPLE_SEC);
                        return;
                    }
                });
            }
            if (test.equals(biter[8])) {
                dropImage.setBackgroundResource(R.drawable.peach);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_PEAC_TREE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_PEAC_TREE);
                        return;
                    }
                });
            }
            if (test.equals(biter[9])) {
                dropImage.setBackgroundResource(R.drawable.xenta);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_ABSENT);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_ABSENT);
                        return;
                    }
                });
            }
            if (test.equals(biter[10])) {
                dropImage.setBackgroundResource(R.drawable.baileys);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BAILEYS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BAILEYS);
                        return;
                    }
                });
            }
            if (test.equals(biter[11])) {
                dropImage.setBackgroundResource(R.drawable.khalua);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_KHALUA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_KHALUA);
                        return;
                    }
                });
            }
            if (test.equals(cola[0])) {
                dropImage.setBackgroundResource(R.drawable.cola);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_COLA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_COLA);
                        return;
                    }
                });
            }
            if (test.equals(cola[1])) {
                dropImage.setBackgroundResource(R.drawable.sprite);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_SPRITE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_SPRITE);
                        return;
                    }
                });
            }
            if (test.equals(cola[2])) {
                dropImage.setBackgroundResource(R.drawable.tonic);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_TONIC);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_TONIC);
                        return;
                    }
                });
            }
            if (test.equals(cola[3])) {
                dropImage.setBackgroundResource(R.drawable.morsh_still);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORSHIN_STILL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORSHIN_STILL);
                        return;
                    }
                });
            }
            if (test.equals(cola[4])) {
                dropImage.setBackgroundResource(R.drawable.morsh_gas);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_MORSHIN_GAS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_MORSHIN_GAS);
                        return;
                    }
                });
            }
            if (test.equals(cola[5])) {
                dropImage.setBackgroundResource(R.drawable.borjomi);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_COLA);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_COLA);
                        return;
                    }
                });
            }
            if (test.equals(cola[6])) {
                dropImage.setBackgroundResource(R.drawable.red_bull);
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_RED_BULL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_RED_BULL);
                        return;
                    }
                });
            }
        }
        entries = setArchiveDB;
        adapter = new RecyclerAdapterSecond(entries);
        linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true); // необязательно
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // необязательно
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(itemAnimator);
        adapter.notifyDataSetChanged();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {

            @Override
            public void onClick(View view, int position) {

                switch (position) {
                    case 0:
                        Toast.makeText(getApplicationContext(), " pos 0", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onLongClick(View view, final int position) {

                Object object = setArchiveDB.get(position);

                if (position == 0) {
                    return;
                }
                final NewsItem newsItems = (NewsItem) object;

                AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
                builder.setTitle("delete")
                        .setPositiveButton(getString(R.string.on),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int id) {

                                        Bundle extras = getIntent().getExtras();
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_JAMESON);
                                            } else if (test.equals(visky[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS);
                                            } else if (test.equals(visky[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS10);
                                            } else if (test.equals(visky[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS_BLACK);
                                            } else if (test.equals(visky[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_RED_LABEL);
                                            } else if (test.equals(visky[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BLACK_LABEL);
                                            } else if (test.equals(visky[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_GOLD_LABEL);
                                            } else if (test.equals(visky[7])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BELLS);
                                            } else if (test.equals(visky[8])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_DJACK_DANIELS);
                                            } else if (test.equals(visky[9])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_DJACK_SINGLE);
                                            } else if (test.equals(visky[10])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_SINGLETON);
                                            } else if (test.equals(visky[11])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_CHIWAS_REGAL);
                                            } else if (test.equals(vodka[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_NEMIROFF);
                                            } else if (test.equals(vodka[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_NEMIROFF_LEXX);
                                            } else if (test.equals(vodka[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_NEMIROFF_PAPER);
                                            } else if (test.equals(vodka[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_GREY_GOOSE);
                                            } else if (test.equals(vodka[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_SMIRNOFF);
                                            } else if (test.equals(beer[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_GUINNESS);
                                            } else if (test.equals(beer[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_KILKENNY);
                                            } else if (test.equals(beer[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_HARP);
                                            } else if (test.equals(beer[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_HOEGAARDEN);
                                            } else if (test.equals(beer[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_LEFFE_BLONDE);
                                            } else if (test.equals(beer[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_LEFFE_BRUNE);
                                            } else if (test.equals(beer[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_CORONA_EXTRA);
                                            } else if (test.equals(beer[7])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_WARSCHTAINER);
                                            } else if (test.equals(shot[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_GORDONS);
                                            } else if (test.equals(shot[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_JOSE_CUERVO_SILVER);
                                            } else if (test.equals(shot[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_JOSE_CUERVO_GOLD);
                                            } else if (test.equals(shot[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORGAN_GOLD);
                                            } else if (test.equals(shot[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORGAN_WHITE);
                                            } else if (test.equals(shot[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORGAN_BLACK);
                                            } else if (test.equals(shot[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORGAN_SPICED);
                                            } else if (test.equals(biter[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_JAGERMEISTER);
                                            } else if (test.equals(biter[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BECHEROVKA);
                                            } else if (test.equals(biter[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MARTINI_BIANCO);
                                            } else if (test.equals(biter[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MARTINI_ROSSO);
                                            } else if (test.equals(biter[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MARTINI_EXTRA_DRY);
                                            } else if (test.equals(biter[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_SAMBUKA);
                                            } else if (test.equals(biter[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_PISANG);
                                            } else if (test.equals(biter[7])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_TRIPLE_SEC);
                                            } else if (test.equals(biter[8])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_PEAC_TREE);
                                            } else if (test.equals(biter[9])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_ABSENT);
                                            } else if (test.equals(biter[10])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BAILEYS);
                                            } else if (test.equals(biter[11])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_KHALUA);
                                            } else if (test.equals(cola[0])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_COLA);
                                            } else if (test.equals(cola[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_SPRITE);
                                            } else if (test.equals(cola[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_TONIC);
                                            } else if (test.equals(cola[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORSHIN_STILL);
                                            } else if (test.equals(cola[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_MORSHIN_GAS);
                                            } else if (test.equals(cola[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BORJOMI);
                                            } else if (test.equals(cola[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_RED_BULL);
                                            }

                                        }

                                        adapter.notifyDataSetChanged();
                                        Intent intent = getIntent();
                                        finish();
                                        startActivity(intent);
                                    }
                                }
                        )
                        .

                                setNegativeButton(getString(R.string.off),

                                        new DialogInterface.OnClickListener()

                                        {
                                            @Override
                                            public void onClick(DialogInterface dialog,
                                                                int id) {
                                                dialog.cancel();
                                            }
                                        }

                                )
                        .

                                show();
            }
        }

        ));
    }

    private void customAlert(final String string) {
        AlertDialog alertDialog;
        final List<Integer> data = new ArrayList<>();
        if ((test.equals(beer[0])) || (test.equals(beer[1])) || (test.equals(beer[2])) || (test.equals(beer[3])) ||
                (test.equals(beer[4])) || (test.equals(beer[5]))) {
            for (int i = -10000; i <= 10000; i = i + 500)
                data.add(i);
        } else {
        if ((test.equals(beer[6])) || (test.equals(beer[7])) || test.equals(cola[0]) ||
                (test.equals(cola[1])) || (test.equals(cola[2])) || test.equals(cola[3]) ||
                (test.equals(cola[4])) || (test.equals(cola[5])) || (test.equals(cola[6]))) {
            for (int i = -20; i <= 20; i = i + 1)
                data.add(i);
        } else {
            for (int i = -1000; i <= 1000; i = i + 50)
                data.add(i);
        }}

        final Integer[] point = data.toArray(new Integer[data.size()]);
        final LayoutInflater inflater = this.getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.picker, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Количество");
        builder.setView(alertLayout);
        final WheelPicker input = (WheelPicker) alertLayout.findViewById(R.id.point_picker);
        input.setData(data);
        input.setCurved(true);
        input.setIndicator(true);
        input.setIndicatorColor(R.color.colorForHelp);
        input.setSelectedItemTextColor(R.color.colorForHelp);
        input.setAtmospheric(true);
        input.setVisibleItemCount(6);
        input.setSelectedItemPosition(20);
        input.setOnItemSelectedListener(this);
        builder.setPositiveButton(getText(R.string.on), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int id = input.getCurrentItemPosition();
                if (point[id] != 0) {
                    Calendar c = Calendar.getInstance();
                    SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
                    String formattedDate = df.format(c.getTime());
                    databaseHelper.addNewsItem(new NewsItem(formattedDate, Integer.parseInt(point[id].toString())), string);

                    intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton(getText(R.string.off), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
            }
        });
        alertDialog = builder.create();
        alertDialog.getWindow().getAttributes().windowAnimations = R.style.Animations_SmileWindow;
        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        alertDialog.show();

    }

    @Override
    public void onItemSelected(WheelPicker picker, Object data, int position) {
    }
@SuppressWarnings("StatementWithEmptyBody")
@Override
public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_menu) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        }
        if (id == R.id.nav_add) {

        } else if (id == R.id.nav_coctail) {
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_dolg) {
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        }

@Override
public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
        } else {
        super.onBackPressed();
        }
}