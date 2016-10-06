package com.example.admin.booblin01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 06.10.2016.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private ArrayList<Friend> friends;
    private LayoutInflater inflater;

    // каждый друг внутри себя содержит свое меню (доп. информацию).
    public ExpandableListAdapter(Context context, ArrayList<Friend> list) {
        inflater = LayoutInflater.from(context);
        friends = list;
    }

    @Override
    public int getGroupCount() {

        return friends.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return friends.get(groupPosition).getMenu().size();
    }

    @Override
    public Object getGroup(int groupPosition) {

        return friends.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        return friends.get(groupPosition).getMenu().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {

        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {

        return childPosition;
    }

    @Override
    public boolean hasStableIds() {

        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_friend, null);
        }
        // получили группу (друга)
        Friend fr = friends.get(groupPosition);
        ((TextView) convertView.findViewById(R.id.f_s_names)).setText(fr
                .getText());

        // ((ImageView)
        // convertView.findViewById(R.id.photoFriend)).setImageBitmap(fr.getBmp());
        ((ImageView) convertView.findViewById(R.id.congratuated))
                .setVisibility((fr.isCongratulated() ? View.VISIBLE : View.GONE));
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        FriendMenu menu = (FriendMenu) getChild(groupPosition, childPosition);
        convertView = inflater
                .inflate(R.layout.item_friend_menu, parent, false);

        ((TextView) convertView.findViewById(R.id.m_Nick)).setText(menu
                .getNick());

        switch (menu.getSex()) {
            case 1:
                ((TextView) convertView.findViewById(R.id.m_Sex))
                        .setText("-");
                break;
            case 0:
                ((TextView) convertView.findViewById(R.id.m_Sex))
                        .setText("+");
                break;
        }
        ((TextView) convertView.findViewById(R.id.m_Bdate)).setText(menu
                .getBdate());
        ((TextView) convertView.findViewById(R.id.m_Template)).setText(menu
                .getTemplate_name());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return false;
    }

}