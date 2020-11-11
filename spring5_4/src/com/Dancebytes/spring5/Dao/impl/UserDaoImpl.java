package com.Dancebytes.spring5.Dao.impl;

import com.Dancebytes.spring5.Dao.UserDao;

/**
 * @author 孟享广
 * @date 2020-11-11 6:09 下午
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("UserDaoImpl add()....");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("UserDaoImpl update()....");
        return id;
    }
}
