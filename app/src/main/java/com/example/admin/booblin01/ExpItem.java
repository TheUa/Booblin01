package com.example.admin.booblin01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Admin on 13.10.2016.
 */

public class ExpItem {

    private String expHead;
    private ArrayList<NewsItem> menu;
    private String second_id;
    private String second_data;

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

    public String getSecond_id() {
        return second_id;
    }

    public void setSecond_id(String second_id) {
        this.second_id = second_id;
    }

    public String getSecond_data() {
        return second_data;
    }

    public void setSecond_data(String second_data) {
        this.second_data = second_data;
    }
}
