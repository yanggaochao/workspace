package com.login.demo.service;

import com.login.demo.entity.User;

public interface UserService {

    public User login(String loginId,String loginPwd);
}
