package com.DanceBytes.spring5.dao.impl;

import com.DanceBytes.spring5.dao.UserDao;

/**
 * @author 孟享广
 * @date 2020-11-07 4:40 下午
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("UserDaoImpl.update()...");
    }
}
