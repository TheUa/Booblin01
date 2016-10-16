package com.example.admin.booblin01;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.width;

/**
 * Created by Admin on 13.10.2016.
 */

public class ExpandableFragment extends Fragment {

    private ExpandableListView expandableListView;
    private DisplayMetrics metrics;
    private int width;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.expandable_fragment, container, false);

        metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;

        expandableListView = (ExpandableListView) view.findViewById(R.id.expandableList);
        ExpandableListAdapter adapter = new ExpandableListAdapter(getActivity(), getExpanablaList());
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

    public ArrayList getExpanablaList() {

        ArrayList<ExpItem> expList = new ArrayList<>();
        ArrayList<NewsItem> newsItemsExp = new ArrayList<>();

        ExpItem expItem = new ExpItem();
        NewsItem newsItem = new NewsItem();
        newsItem.setSecond_id("aaa");
        newsItem.setSecond_data("12");
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id("bbb");
        newsItem.setSecond_data("23");
        newsItemsExp.add(newsItem);

        newsItem = new NewsItem();
        newsItem.setSecond_id("ccc");
        newsItem.setSecond_data("34");
        newsItemsExp.add(newsItem);

        expItem.setMenu(newsItemsExp);
        expItem.setExpHead("Main");
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

    public int GetDipsFromPixel(float pixels)
    {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }
}
