package com.example.admin.booblin01;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Admin on 13.10.2016.
 */

public class ExpandableFragment extends android.app.Fragment {

    private ExpandableListView expandableListView;
    private DisplayMetrics metrics;
    private int width;
    private DatabaseHelper databaseHelper;
    private ExpandableListAdapter adapter;
    private ArrayList entries = new ArrayList<>();
    private String KEY = "KEY";
    private Object object;
    private String[] drink;
    private String[] vodka;
    private String[] beer;
    private String[] biter;
    private String[] shot;
    private String[] cola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.expandable_fragment, container, false);

        Log.e("FUCK", "onCreate");
        Log.d("FUCK", "onCreate");

        drink = getResources().getStringArray(R.array.visky);
        vodka = getResources().getStringArray(R.array.vodka);
        beer = getResources().getStringArray(R.array.beer);
        biter = getResources().getStringArray(R.array.biter);
        shot = getResources().getStringArray(R.array.shot);
        cola = getResources().getStringArray(R.array.cola);


        metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;
        databaseHelper = new DatabaseHelper(getActivity());

        expandableListView = (ExpandableListView) view.findViewById(R.id.expandableList);
        adapter = new ExpandableListAdapter(getActivity(), getExpandableList());
        expandableListView.setAdapter(adapter);
        expandableListView.setIndicatorBounds(width - GetDipsFromPixel(50), width - GetDipsFromPixel(10));

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                Toast.makeText(getActivity(), "gr " + groupPosition + " chld " + childPosition, Toast.LENGTH_LONG).show();

                switch (groupPosition) {
                    case 0:
                        Intent intent = new Intent(getActivity(), SecondActivity.class);
                        intent.putExtra(KEY, drink[childPosition]);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getActivity(), SecondActivity.class);
                        intent.putExtra(KEY, vodka[childPosition]);
                        startActivity(intent);
                        break;
                }


                return false;
            }
        });
        return view;
    }

    public ArrayList getExpandableList() {

        ArrayList<ExpItem> expList = new ArrayList<>();
        ArrayList<NewsItem> newsItemsExp = new ArrayList<>();

        ExpItem expItem = new ExpItem();
        NewsItem newsItem = new NewsItem();
        newsItem.setSecond_id(drink[0]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_JAMESON))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[1]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BUSHMILLS))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[2]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BUSHMILLS10))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[3]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BUSHMILLS_BLACK))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[4]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_RED_LABEL))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[5]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BLACK_LABEL))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[6]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_GOLD_LABEL))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[7]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BELLS))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[8]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_DJACK_DANIELS))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[9]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_DJACK_SINGLE))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[10]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_SINGLETON))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[11]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_CHIWAS_REGAL))));
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead(getString(R.string.viski));
        expList.add(expItem);


//      =====2=====
        newsItemsExp = new ArrayList<NewsItem>();
        expItem = new ExpItem();
        newsItem = new NewsItem();
        newsItem.setSecond_id(vodka[0]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_NEMIROFF))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(vodka[1]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_NEMIROFF_LEXX))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(vodka[2]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_NEMIROFF_PAPER))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(vodka[3]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_GREY_GOOSE))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(vodka[4]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_SMIRNOFF))));
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead(getString(R.string.vodka));
        expList.add(expItem);

//      =====3=====
        newsItemsExp = new ArrayList<NewsItem>();
        expItem = new ExpItem();
        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[0]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_GUINNESS))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[1]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_KILKENNY))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[2]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_HARP))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[3]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_HOEGAARDEN))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[4]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_LEFFE_BLONDE))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[5]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_LEFFE_BRUNE))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[6]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_CORONA_EXTRA))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(beer[7]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_WARSCHTAINER))));
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead(getString(R.string.beer));
        expList.add(expItem);

        expItem = new ExpItem();
        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[0]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_JAGERMEISTER))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[1]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BECHEROVKA))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[2]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_MARTINI_BIANCO))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[3]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_MARTINI_ROSSO))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[4]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_MARTINI_EXTRA_DRY))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[5]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_SAMBUKA))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[6]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_PISANG))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[7]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_TRIPLE_SEC))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[8]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_PEAC_TREE))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[9]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_ABSENT))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[10]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BAILEYS))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(biter[11]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_KHALUA))));
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead(getString(R.string.biter));
        expList.add(expItem);

        return expList;
    }

    public int GetDipsFromPixel(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FUCK", "resume 3");
//        entries.clear();
//        entries.addAll(getExpandableList());
        adapter = new ExpandableListAdapter(getActivity(), getExpandableList());
        expandableListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        Log.e("FUCK", "resume 0.4");
    }
}
