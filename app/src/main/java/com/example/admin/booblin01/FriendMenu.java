package com.example.admin.booblin01;

/**
 * Created by Admin on 06.10.2016.
 */

public class FriendMenu {
    public FriendMenu() {

    }

    private String nick, bdate, template_name;
    private int sex, user_id;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public int getId() {
        return user_id;
    }

    public void setId(int id) {
        this.user_id = id;
    }
}
