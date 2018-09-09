package com.sevenpounds.encounter.dto;

import com.sevenpounds.encounter.entity.User;
import com.sevenpounds.encounter.enums.UserStateEnums;

import java.util.List;

/**
 * Create by jingzfan on 9/6/2018.
 */
public class UserExecution {
    // 结果状态
    private int state;

    // 状态标识
    private String stateInfo;

    // user数量
    private int count;

    // 操作的user(增删改user的时候用到)
    private User user;

    // user列表(查询user列表的时候使用)
    private List<User> userList;

    public UserExecution() {

    }

    // user操作失败的时候使用的构造器
    public UserExecution(UserStateEnums stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    // user操作成功的时候使用的构造器
    public UserExecution(UserStateEnums stateEnum, User user) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.user = user;
    }

    // user操作成功的时候使用的构造器
    public UserExecution(UserStateEnums stateEnum, List<User> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.userList = shopList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
