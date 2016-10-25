package com.example.admin.booblin01;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Admin on 02.08.2016.
 */
public class MinusFragment extends Fragment {

    private RecyclerView recyclerView;
    private MinusFragment minusFragment;
    private FragmentManager fragmentManager;
    private String KEY = "KEY";
    private Object object;
    private AlertDialog alertDialog;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.minus_fragment, container, false);

        final String[] viski = getResources().getStringArray(R.array.visky);

        recyclerView = (RecyclerView) view.findViewById(R.id.minusRecycler);

        RecyclerAdapter adapter = new RecyclerAdapter(getNewItem());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true); // необязательно
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // необязательно
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView,
                new RecyclerTouchListener.ClickListener() {

            @Override
            public void onClick(View view, int position){

                switch (position){
                    case 0:

                        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Виски"); // заголовок для диалога

                        builder.setItems(R.array.visky, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){

                                    case 0:
                                        Intent intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[0]);
                                        startActivity(intent);
                                        break;
                                    case 1:
//                                        intent = new Intent(getActivity(), ScrollingActivity.class);
//                                        startActivity(intent);
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[1]);
                                        startActivity(intent);
                                        break;
                                    case 2:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[2]);
                                        startActivity(intent);
                                        break;
                                    case 3:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[3]);
                                        startActivity(intent);
                                        break;
                                    case 4:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[4]);
                                        startActivity(intent);
                                        break;
                                    case 5:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[5]);
                                        startActivity(intent);
                                        break;
                                    case 6:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[6]);
                                        startActivity(intent);
                                        break;
                                    case 7:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[7]);
                                        startActivity(intent);
                                        break;
                                    case 8:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[8]);
                                        startActivity(intent);
                                        break;
                                    case 9:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[9]);
                                        startActivity(intent);
                                        break;
                                    case 10:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[10]);
                                        startActivity(intent);
                                        break;
                                    case 11:
                                        intent = new Intent(getActivity(), SecondActivity.class);
                                        intent.putExtra(KEY, viski[11]);
                                        startActivity(intent);
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        builder.show();

                        break;
                    case 1:

                        builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Водка"); // заголовок для диалога

                        builder.setItems(R.array.vodka, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){
                                    case 0:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 1" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 2" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 3" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        builder.show();

                        break;

                    case 2:
                        builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Пиво"); // заголовок для диалога

                        builder.setItems(R.array.beer, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){
                                    case 0:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 1" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 2" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 3" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        builder.show();
                        break;
                    case 3:
                        builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Настойки, Апперетивы, Ликеры"); // заголовок для диалога

                        builder.setItems(R.array.biter, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){
                                    case 0:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 1" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 2" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 3" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        builder.show();
                        break;
                    case 4:
                        builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Ром, Текила, Джин"); // заголовок для диалога

                        builder.setItems(R.array.shot, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){
                                    case 0:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 1" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 2" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 3" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        builder.show();
                        break;
                    case 5:
                        builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Напитки"); // заголовок для диалога

                        builder.setItems(R.array.cola, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {

                                switch (item){
                                    case 0:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 1" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 2" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(),
                                                "Выбранный кот: 3" ,
                                                Toast.LENGTH_SHORT).show();
                                        break;
                                }

                            }
                        });
                        builder.setCancelable(true);
                        alertDialog = builder.create();
                        alertDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnim;
                        alertDialog.show();
                        break;
                }

            }

            @Override
            public void onLongClick(View view, int position) {

                Toast.makeText(getActivity(), "Не залипай", Toast.LENGTH_LONG)
                        .show();
            }
        }));
        return view;
    }

    private ArrayList getNewItem() {

        ArrayList<NewsItem> results = new ArrayList<>();
        NewsItem newsData = new NewsItem();
        newsData.setHeadline("Виски");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Водка");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Пиво");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Настойки, Ликеры, Мартини");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Ром, Текила, Джин");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Вода, Кола, Соки");
        results.add(newsData);

        return results;


    }
}
