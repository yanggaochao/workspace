package com.login.demo.dao;

import com.login.demo.entity.User;

public interface UserDao {
    public User login(String loginId, String loginPwd);
}
