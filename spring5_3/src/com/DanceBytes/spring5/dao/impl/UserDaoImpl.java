package com.DanceBytes.spring5.dao.impl;

import com.DanceBytes.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 孟享广
 * @date 2020-11-11 3:55 下午
 * @description
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl add().....");
    }
}