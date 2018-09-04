package com.sevenpounds.encounter.entity;

public class Catorgery {
    private int catorgery_id;

    private String catorgery_name;

    private int father_id;

    private int son_id;

    public int getCatorgery_id() {
        return catorgery_id;
    }

    public void setCatorgery_id(int catorgery_id) {
        this.catorgery_id = catorgery_id;
    }

    public String getCatorgery_name() {
        return catorgery_name;
    }

    public void setCatorgery_name(String catorgery_name) {
        this.catorgery_name = catorgery_name;
    }

    public int getFather_id() {
        return father_id;
    }

    public void setFather_id(int father_id) {
        this.father_id = father_id;
    }

    public int getSon_id() {
        return son_id;
    }

    public void setSon_id(int son_id) {
        this.son_id = son_id;
    }
}
