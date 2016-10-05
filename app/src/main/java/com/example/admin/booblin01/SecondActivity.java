package com.example.admin.booblin01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        final Bundle extras = getIntent().getExtras();
        test = extras.getString(KEY);

        databaseHelper = new DatabaseHelper(this);
        final String[] visky = getResources().getStringArray(R.array.visky);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                    if (extras != null){
                        collapsingToolbarLayout.setTitle(test);
                    }

                    isShow = true;
                } else if(isShow) {
                    collapsingToolbarLayout.setTitle(" ");//carefull there should a space between double quote otherwise it wont work
                    isShow = false;
                }
            }
        });

        View fabClick = findViewById(R.id.fab_click);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerSecond);



        if (extras != null) {
            if (test.equals(visky[0])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.jameson));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JAMESON);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JAMESON);
                    }
                });


            }
            if (test.equals(visky[1])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.jameson));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_JAMESON12);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_JAMESON12);
                    }
                });
            }
            if (test.equals(visky[2])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.bushmills));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS);
                    }
                });
            }
            if (test.equals(visky[3])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.bushmills10));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS10);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS10);
                    }
                });
            }
            if (test.equals(visky[4])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.bushmillsblack));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BUSHMILLS_BLACK);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BUSHMILLS_BLACK);
                    }
                });
            }
            if (test.equals(visky[5])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.red));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_RED_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_RED_LABEL);
                    }
                });
            }
            if (test.equals(visky[6])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.black));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BLACK_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BLACK_LABEL);
                    }
                });
            }
            if (test.equals(visky[7])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.gold));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_GOLD_LABEL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_GOLD_LABEL);
                    }
                });
            }
            if (test.equals(visky[8])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.bells));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_BELLS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_BELLS);
                    }
                });
            }
            if (test.equals(visky[9])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.jack));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_DJACK_DANIELS);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_DJACK_DANIELS);
                    }
                });
            }
            if (test.equals(visky[10])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.single));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_DJACK_SINGLE);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_DJACK_SINGLE);
                    }
                });
            }
            if (test.equals(visky[11])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.singleton));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_SINGLETON);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_SINGLETON);
                    }
                });
            }
            if (test.equals(visky[12])) {
                collapsingToolbarLayout.setBackground(getResources().getDrawable(R.drawable.chivas));
                setArchiveDB = databaseHelper.getNewsItem(databaseHelper.DATABASE_CHIWAS_REGAL);
                fabClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customAlert(databaseHelper.DATABASE_CHIWAS_REGAL);
                    }
                });
            }
        }
        adapter = new RecyclerAdapterSecond(setArchiveDB);
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
            public void onLongClick(View view, int position) {

                Object object = setArchiveDB.get(position);

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
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[1])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_JAMESON12);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[2])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[3])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS10);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[4])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BUSHMILLS_BLACK);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[5])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_RED_LABEL);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[6])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BLACK_LABEL);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[7])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_GOLD_LABEL);
                                            }
                                        } if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[8])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_BELLS);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[9])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_DJACK_DANIELS);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[10])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_DJACK_SINGLE);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[11])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_SINGLETON);
                                            }
                                        }
                                        if (extras != null) {
                                            test = extras.getString(KEY);
                                            if (test.equals(visky[12])) {
                                                databaseHelper.deleteNewsItem(newsItems, databaseHelper.DATABASE_CHIWAS_REGAL);
                                            }
                                        }


                                        Intent intent = getIntent();
                                        finish();
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton(getString(R.string.off),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                })
                        .show();
            }
        }));
    }
    private void customAlert(final String string) {
        AlertDialog alertDialog;
        final List<Integer> data = new ArrayList<>();
        for (int i = -1000; i <= 1000; i = i + 50)
            data.add(i);
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
        input.setIndicatorColor(getResources().getColor(R.color.datapickerGrayLines));
        input.setSelectedItemTextColor(getResources().getColor(R.color.datapickerBlackLines));
        input.setAtmospheric(true);
        input.setVisibleItemCount(6);
        input.setSelectedItemPosition(20);
        input.setOnItemSelectedListener(this);
        builder.setPositiveButton(getText(R.string.on), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int id = input.getCurrentItemPosition();
                Log.e("FUCK", "точка: " + point[id]);
                if (point[id]!=0){
                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
                String formattedDate = df.format(c.getTime());
                databaseHelper.addNewsItem(new NewsItem(formattedDate, Integer.parseInt(point[id].toString())), string);
                intent = getIntent();
                finish();
                startActivity(intent);
            }}
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
        Log.e("FUCK", "=+-" + data.toString());
    }
}