package com.entity;

import java.util.Date;

public class UserLoginCache extends User {

    private Date loginTime;

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
