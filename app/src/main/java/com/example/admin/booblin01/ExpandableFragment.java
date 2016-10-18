package com.example.admin.booblin01;

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

public class ExpandableFragment extends Fragment {

    private ExpandableListView expandableListView;
    private DisplayMetrics metrics;
    private int width;
    private DatabaseHelper databaseHelper;
    private ExpandableListAdapter adapter;
    private ArrayList entries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.expandable_fragment, container, false);

        Log.e("FUCK", "onCreate");
        Log.d("FUCK", "onCreate");


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
                Toast.makeText(getActivity(), "gr " + groupPosition + " chld " + childPosition, Toast.LENGTH_LONG).show();
                return false;
            }
        });
        return view;
    }

    public ArrayList getExpandableList() {

        ArrayList<ExpItem> expList = new ArrayList<>();
        ArrayList<NewsItem> newsItemsExp = new ArrayList<>();
        String[] drink = getResources().getStringArray(R.array.visky);

        ExpItem expItem = new ExpItem();
        NewsItem newsItem = new NewsItem();
        newsItem.setSecond_id(drink[0]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_JAMESON))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[1]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_JAMESON12))));
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id(drink[2]);
        newsItem.setSecond_data((String.valueOf(databaseHelper.getSum(newsItem, databaseHelper.DATABASE_BUSHMILLS))));
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead(getString(R.string.viski));
        expList.add(expItem);


//    =====2=====
        newsItemsExp = new ArrayList<NewsItem>();
        expItem = new ExpItem();
        newsItem = new NewsItem();
        newsItem.setSecond_id("ddd");
        newsItem.setSecond_data("44");
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id("eee");
        newsItem.setSecond_data("555");
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id("fff");
        newsItem.setSecond_data("4343");
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead("Second");
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
        entries.clear();
        entries.addAll(getExpandableList());
        adapter = new ExpandableListAdapter(getActivity(), getExpandableList());
        expandableListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        Log.e("FUCK", "resume 0.4");
    }
}
