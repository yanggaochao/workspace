package com.login.demo.dao.impl;

import com.login.demo.dao.UserDao;
import com.login.demo.entity.User;

public class UserDaoImpl implements UserDao {
    public User login(String loginId, String loginPwd) {
        User user=null;
        if ("admin".equals(loginId)){
            if ("admin".equals(loginPwd)){
                user=new User();
                user.setLoginId("123");
                user.setLoginName("123");
                user.setLoginPwd("123");
            }
        }
        return user;
    }
}
