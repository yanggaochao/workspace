package com.login.demo.web.controller;

import com.login.demo.entity.User;
import com.login.demo.service.UserService;
import com.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");
        User user = userService.login(loginId, loginPwd);
        if (user==null){
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
        else{
            req.getRequestDispatcher("/sucess.jsp").forward(req,resp);
        }
    }
}
