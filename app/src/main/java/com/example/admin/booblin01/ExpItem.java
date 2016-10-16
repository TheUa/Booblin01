package com.example.admin.booblin01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Admin on 13.10.2016.
 */

public class ExpItem {

    private String expHead;
    private ArrayList<NewsItem> menu;

    public ArrayList<NewsItem> getMenu() {
        return menu;
    }
    public void setMenu(ArrayList<NewsItem> menus) {
        this.menu = menus;
    }

    public String getExpHead() {
        return expHead;
    }

    public void setExpHead(String string){
        this.expHead = string;
    }
}
