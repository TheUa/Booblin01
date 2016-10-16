package com.example.admin.booblin01;

/**
 * Created by Admin on 13.10.2016.
 */

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    //Названия заголовков
    private ArrayList<ExpItem> listDataHeader;
    //Данные для элементов подпунктов:
//    private ArrayList<NewsItem> listDataChild;

    public ExpandableListAdapter(Context context, ArrayList<ExpItem> listDataHeader) {
        this.context = context;
        this.listDataHeader = listDataHeader;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return listDataHeader.get(groupPosition).getMenu().get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        NewsItem newsItem = (NewsItem) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item, null);
        }

        ((TextView) convertView.findViewById(R.id.expListItem)).setText(newsItem.getSecond_id());

        ((TextView) convertView.findViewById(R.id.expListCount)).setText(newsItem.getSecond_data());

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listDataHeader.get(groupPosition).getMenu().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

        ExpItem expItem = listDataHeader.get(groupPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        ((TextView) convertView.findViewById(R.id.expListHeader)).setText(expItem.getExpHead());

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
