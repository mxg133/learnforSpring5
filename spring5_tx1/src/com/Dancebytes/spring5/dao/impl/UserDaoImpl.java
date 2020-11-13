package com.Dancebytes.spring5.dao.impl;

import com.Dancebytes.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 孟享广
 * @date 2020-11-13 2:02 下午
 * @description
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money-? WHERE username=?";
        int i = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println(i);
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money+? WHERE username=?";
        int i = jdbcTemplate.update(sql, 100, "mary");
        System.out.println(i);
    }
}
