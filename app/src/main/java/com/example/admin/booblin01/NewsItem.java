package com.example.admin.booblin01;

import java.util.ArrayList;

/**
 * Created by Admin on 03.08.2016.
 */
public class NewsItem {
    private String headline;
    private int second_headline;
    private String second_id;
    private String second_data;


    public NewsItem() {
    }

    public NewsItem(String formattedDate, int s) {
        this.second_headline = s;
        this.second_data = formattedDate;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public int getSecond_headline() {
        return second_headline;
    }

    public void setSecond_headline(int second_headline) {
        this.second_headline = second_headline;
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
