package com.sevenpounds.encounter.entity;

import java.util.Date;

public class Essay {
    private  int essay_id;

    private int catorgery_id;

    private int user_id;

    private String essay_name;

    private String essay_content;

    private Date  essay_create_time;

    private Date essay_last_edit_time;

    public int getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(int essay_id) {
        this.essay_id = essay_id;
    }

    public int getCatorgery_id() {
        return catorgery_id;
    }

    public void setCatorgery_id(int catorgery_id) {
        this.catorgery_id = catorgery_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEssay_name() {
        return essay_name;
    }

    public void setEssay_name(String essay_name) {
        this.essay_name = essay_name;
    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    public Date getEssay_create_time() {
        return essay_create_time;
    }

    public void setEssay_create_time(Date essay_create_time) {
        this.essay_create_time = essay_create_time;
    }

    public Date getEssay_last_edit_time() {
        return essay_last_edit_time;
    }

    public void setEssay_last_edit_time(Date essay_last_edit_time) {
        this.essay_last_edit_time = essay_last_edit_time;
    }
}
