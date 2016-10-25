package com.example.admin.booblin01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 04.08.2016.
 */
public class ViskiFragment extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private RecyclerAdapterSecond adapter;
    private ArrayList entries = new ArrayList<>();
    private String[] viski;
    private String KEY = "KEY";
    private TextView id;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sum_fragment, container, false);

        viski = getResources().getStringArray(R.array.visky);

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

//        id = (TextView) view.findViewById(R.id.id_second);
//        id.setVisibility(View.GONE);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView,
                new RecyclerTouchListener.ClickListener() {

                    @Override
                    public void onClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), SecondActivity.class);
                        intent.putExtra(KEY, viski[position]);
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
        newsData.setSecond_data(viski[0]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_JAMESON))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[1]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[2]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS10))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[3]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BUSHMILLS_BLACK))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[4]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_RED_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[5]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BLACK_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[6]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_GOLD_LABEL))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[7]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_BELLS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[8]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_DJACK_DANIELS))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[9]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_DJACK_SINGLE))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[10]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_SINGLETON))));
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setSecond_data(viski[11]);
        newsData.setHeadline((String.valueOf(databaseHelper.getSum(newsData, databaseHelper.DATABASE_CHIWAS_REGAL))));
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
        Log.e("FUCK", "resume 0.1");
    }
}
