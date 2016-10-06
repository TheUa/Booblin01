package com.example.admin.booblin01;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by Admin on 06.10.2016.
 */

public class Friend {
    public Friend() {

    }

    private ArrayList<FriendMenu> menu;
    private Bitmap bmp;
    private String text;
    private boolean congratulated;

    public ArrayList<FriendMenu> getMenu() {
        return menu;
    }
    public void setMenu(ArrayList<FriendMenu> menus) {
        this.menu = menus;
    }
    public boolean isCongratulated() {
        return congratulated;
    }
    public void setCongratulated(boolean congratulated) {
        this.congratulated = congratulated;
    }
    public Bitmap getBmp() {
        return bmp;
    }
    public void setBmp(Bitmap bmp) {
        this.bmp=bmp;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
