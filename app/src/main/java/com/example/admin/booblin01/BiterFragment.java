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
 * Created by Admin on 24.10.2016.
 */

public class BiterFragment extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private RecyclerAdapterSecond adapter;
    private ArrayList entries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sum_fragment, container, false);

        databaseHelper = new DatabaseHelper(getActivity());

        recyclerView = (RecyclerView) view.findViewById(R.id.sumRecycler);

        entries = getNewItem();
        adapter = new RecyclerAdapterSecond(entries);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true); // необязательно
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // необязательно
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(itemAnimator);
        adapter.notifyDataSetChanged();


        return view;
    }

    private ArrayList getNewItem() {

        String[] biter = getResources().getStringArray(R.array.biter);

        ArrayList<NewsItem> results = new ArrayList<>();
        NewsItem newsData = new NewsItem();
        newsData.setSecond_data(biter[0]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_JAGERMEISTER))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[1]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BECHEROVKA))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[2]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_MARTINI_BIANCO))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[3]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_MARTINI_ROSSO))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[4]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_MARTINI_EXTRA_DRY))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[5]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_SAMBUKA))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[6]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_PISANG))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[7]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_TRIPLE_SEC))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[8]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_PEAC_TREE))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[9]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_ABSENT))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[10]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BAILEYS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(biter[11]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_KHALUA))));
        results.add(newsData);

        return results;
    }

    @Override
    public void onResume() {
        super.onResume();
        entries.clear();
        entries.addAll(getNewItem());
        adapter = new RecyclerAdapterSecond(entries);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        Log.e("FUCK", "resume 0.5");
    }
}