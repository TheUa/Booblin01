package com.example.admin.booblin01;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 12.08.2016.
 */
public class RecyclerAdapterPlus extends RecyclerView.Adapter<RecyclerAdapterPlus.ViewHolder> {


    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта списка
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // наш пункт состоит только из одного TextView
        public TextView plus_drink;
        public TextView plus_sum;
        public TextView plus_id;

        public ViewHolder(View v) {
            super(v);
            plus_drink = (TextView) v.findViewById(R.id.drink_plus);
            plus_sum = (TextView) v.findViewById(R.id.sum_plus);
            plus_id = (TextView) v.findViewById(R.id.id_plus);
        }
    }

    private List<NewsItem> newsItems = new ArrayList<>();


    public void updateList(List<NewsItem> newsItem) {
        newsItems = newsItem;
        notifyDataSetChanged();
    }


    // Конструктор

    public RecyclerAdapterPlus(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }

    // Создает новые views (вызывается layout manager-ом)
    @Override
    public RecyclerAdapterPlus.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_plus, parent, false);

        // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    // Заменяет контент отдельного view (вызывается layout manager-ом)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.plus_sum.setText(Integer.toString(newsItems.get(position).getSecond_headline()));
        holder.plus_drink.setText(newsItems.get(position).getSecond_data());
        holder.plus_id.setText(newsItems.get(position).getSecond_id());
//        holder.mTextView.setText(mDataset[position]);

    }

    // Возвращает размер данных (вызывается layout manager-ом)
    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}