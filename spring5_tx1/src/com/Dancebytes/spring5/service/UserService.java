package com.Dancebytes.spring5.service;

import com.Dancebytes.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 孟享广
 * @date 2020-11-13 1:58 下午
 * @description
 */

@Service
//@Transactional//类事物：所有方法都会有事物
//传播行为 一个方法调用一个方法 |  隔离级别  |  超时时间  ｜   是否只读(能否修改)   ｜   设置哪些异常进行事物回滚   ｜   设置哪些异常不进行事物回滚
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = -1, readOnly = false, rollbackFor = {}, noRollbackFor = {})
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney() {
            userDao.reduceMoney();
            int i = 12 / 0;
            userDao.addMoney();
    }
}