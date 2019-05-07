package com.login.demo.service.impl;

import com.login.demo.dao.UserDao;
import com.login.demo.dao.impl.UserDaoImpl;
import com.login.demo.entity.User;
import com.login.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao=new UserDaoImpl();

    /**
     * 登陆
     * @param loginId
     * @param loginPwd
     * @return
     */
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
