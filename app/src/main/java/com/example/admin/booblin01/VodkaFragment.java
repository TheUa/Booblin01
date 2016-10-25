package com.example.admin.booblin01;

import android.content.Intent;
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

public class VodkaFragment extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private RecyclerAdapterSecond adapter;
    private ArrayList entries = new ArrayList<>();
    private String KEY = "KEY";
    private String[] vodka;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sum_fragment, container, false);

        databaseHelper = new DatabaseHelper(getActivity());

        recyclerView = (RecyclerView) view.findViewById(R.id.sumRecycler);

        vodka = getResources().getStringArray(R.array.vodka);

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

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView,
                new RecyclerTouchListener.ClickListener() {

                    @Override
                    public void onClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), SecondActivity.class);
                        intent.putExtra(KEY, vodka[position]);
                        startActivity(intent);
                    }

                    @Override
                    public void onLongClick(View view, int position) {

                    }
                }

        ));

        return view;
    }

    private ArrayList getNewItem() {



        ArrayList<NewsItem> results = new ArrayList<>();
        NewsItem newsData = new NewsItem();
        newsData.setSecond_data(vodka[0]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_NEMIROFF))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(vodka[1]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_NEMIROFF_LEXX))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(vodka[2]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_NEMIROFF_PAPER))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(vodka[3]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_GREY_GOOSE))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(vodka[4]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_SMIRNOFF))));
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
        Log.e("FUCK", "resume 0.2");
    }
}