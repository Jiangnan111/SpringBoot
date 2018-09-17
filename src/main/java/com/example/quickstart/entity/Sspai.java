package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by Air on 2018/9/10.
 */
@Data
public class Sspai {
    private String avatar;
    private String name;
    private String time;
    private String title;
    private String introduce;
    private String picture;
    private int love;
    private int talk;

    public Sspai(){
    }

    public Sspai(String avatar, String name, String time, String title, String introduce, String picture, int love, int talk) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.introduce = introduce;
        this.picture = picture;
        this.love = love;
        this.talk = talk;
    }
}
