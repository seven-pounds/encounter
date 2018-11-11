package com.sevenpounds.encounter.entity;

public class User {
	  //用户id
    private long userId;
    //用户名
    private String userName;
    //用户类型  1表示游客，2表示登陆用户，3表示问题用户，4表示管理员，5表示超级管理员
    private  int userType;
    //用户密码
    private String password;
    //
    private String gender;
	public long getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

    
}
