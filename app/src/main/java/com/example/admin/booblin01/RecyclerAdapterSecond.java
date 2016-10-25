package com.example.admin.booblin01;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 09.08.2016.
 */
public class RecyclerAdapterSecond extends RecyclerView.Adapter<RecyclerAdapterSecond.ViewHolder> {


    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта списка
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // наш пункт состоит только из одного TextView
        public TextView secondDrink;
        public TextView secondDate;
        public TextView secondID;

        public ViewHolder(View v) {
            super(v);
            secondDrink = (TextView) v.findViewById(R.id.data_second);
            secondDate = (TextView) v.findViewById(R.id.drink_second);
            secondID = (TextView) v.findViewById(R.id.id_second);
        }
    }

    private List<NewsItem> newsItems = new ArrayList<>();


    public void updateList(List<NewsItem> newsItem) {
        newsItems = newsItem;
        notifyDataSetChanged();
    }


    // Конструктор

    public RecyclerAdapterSecond(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }

    // Создает новые views (вызывается layout manager-ом)
    @Override
    public RecyclerAdapterSecond.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_drink_item, parent, false);

        // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    // Заменяет контент отдельного view (вызывается layout manager-ом)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        NewsItem data = newsItems.get(position);
        holder.secondDrink.setText(Integer.toString(newsItems.get(position).getSecond_headline()));
        holder.secondDate.setText(newsItems.get(position).getSecond_data());
        holder.secondID.setText(newsItems.get(position).getSecond_id());
        if(TextUtils.isEmpty(data.getSecond_id())){
            holder.secondID.setVisibility(View.GONE);
        }else{
            holder.secondID.setVisibility(View.VISIBLE);
        }
    }

    // Возвращает размер данных (вызывается layout manager-ом)
    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}