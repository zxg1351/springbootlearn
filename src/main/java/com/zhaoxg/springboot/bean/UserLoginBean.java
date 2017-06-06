package com.zhaoxg.springboot.bean;

/**
 * Created by Administrator on 2017/6/6.
 */
public class UserLoginBean extends BaseInfo {

    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
