package com.login.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String loginName;
    private String loginId;
    private String loginPwd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
