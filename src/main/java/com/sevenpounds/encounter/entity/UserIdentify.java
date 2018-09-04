package com.sevenpounds.encounter.entity;

public class UserIdentify {
    private int user_id;
    //身份证号
    private String id_number;

    private String front_id_pic;

    private String back_id_pic;
    //学位证书号
    private String diploma_id;
    //学位证书照片
    private String diploma_pic;
    //学历
    private String degree_certifacate_number;
    //学历照片
    private String degree_certifacate_pic;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getFront_id_pic() {
        return front_id_pic;
    }

    public void setFront_id_pic(String front_id_pic) {
        this.front_id_pic = front_id_pic;
    }

    public String getBack_id_pic() {
        return back_id_pic;
    }

    public void setBack_id_pic(String back_id_pic) {
        this.back_id_pic = back_id_pic;
    }

    public String getDiploma_id() {
        return diploma_id;
    }

    public void setDiploma_id(String diploma_id) {
        this.diploma_id = diploma_id;
    }

    public String getDipoma_pic() {
        return diploma_pic;
    }

    public void setDipoma_pic(String diploma_pic) {
        this.diploma_pic = diploma_pic;
    }

    public String getDegree_certifacate_number() {
        return degree_certifacate_number;
    }

    public void setDegree_certifacate_number(String degree_certifacate_number) {
        this.degree_certifacate_number = degree_certifacate_number;
    }

    public String getDegree_certifacate_pic() {
        return degree_certifacate_pic;
    }

    public void setDegree_certifacate_pic(String degree_certifacate_pic) {
        this.degree_certifacate_pic = degree_certifacate_pic;
    }
}
