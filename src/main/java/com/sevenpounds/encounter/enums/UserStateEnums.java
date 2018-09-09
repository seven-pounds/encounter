package com.sevenpounds.encounter.enums;

/**
 * Create by jingzfan on 9/6/2018.
 */
public enum UserStateEnums {
    CHECK(0, "审核中"), OFFLINE(-1, "非法用户"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001,
            "内部系统错误"), NULL_USERID(-1002, "userId为空"), NULL_USER(-1003, "user信息为空");
    private int state;
    private String stateInfo;

    private UserStateEnums(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static UserStateEnums stateOf(int state) {
        for (UserStateEnums stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

}
