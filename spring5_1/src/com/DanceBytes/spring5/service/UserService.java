package com.DanceBytes.spring5.service;

import com.DanceBytes.spring5.dao.UserDao;

/**
 * @author 孟享广
 * @date 2020-11-07 4:38 下午
 * @description
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("UserService.add()...");
        userDao.update();
    }
}
