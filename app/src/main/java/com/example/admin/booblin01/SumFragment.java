package com.example.admin.booblin01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Admin on 04.08.2016.
 */
public class SumFragment extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private RecyclerAdapterSecond adapter;
    private ArrayList<String> entries = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sum_fragment, container, false);

        databaseHelper = new DatabaseHelper(getActivity());

        recyclerView = (RecyclerView) view.findViewById(R.id.sumRecycler);

        adapter = new RecyclerAdapterSecond(getNewItem());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true); // необязательно
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // необязательно
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(itemAnimator);


        return view;
    }

    private ArrayList getNewItem() {

        String[] drink = getResources().getStringArray(R.array.visky);

        ArrayList<NewsItem> results = new ArrayList<>();
        NewsItem newsData = new NewsItem();
        newsData.setSecond_id("1 ");
        newsData.setSecond_data(drink[0]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_JAMESON))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("2 ");
        newsData.setSecond_data("Jameson 12");
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_JAMESON12))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("3 ");
        newsData.setSecond_data("Bushmills");
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("4 ");
        newsData.setSecond_data("Bushmills 10");
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS10))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("5 ");
        newsData.setSecond_data("Bushmills Black Bush");
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS_BLACK))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("6 ");
        newsData.setSecond_data(drink[5]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_RED_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("7 ");
        newsData.setSecond_data(drink[6]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BLACK_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("8 ");
        newsData.setSecond_data(drink[7]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_GOLD_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("9 ");
        newsData.setSecond_data(drink[8]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BELLS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("10");
        newsData.setSecond_data(drink[9]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_DJACK_DANIELS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("11");
        newsData.setSecond_data(drink[10]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_DJACK_SINGLE))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("12");
        newsData.setSecond_data(drink[11]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_SINGLETON))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_id("13");
        newsData.setSecond_data(drink[12]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_CHIWAS_REGAL))));
        results.add(newsData);

        return results;
    }

    @Override
    public void onResume() {
        super.onResume();
        getNewItem().clear();
        getNewItem().add(getNewItem());
        adapter = new RecyclerAdapterSecond(getNewItem());
        adapter.notifyDataSetChanged();
        Log.e("FUCK", "resume 0.3");

    }
}
