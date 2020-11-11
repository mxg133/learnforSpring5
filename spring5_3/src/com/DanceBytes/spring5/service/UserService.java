package com.DanceBytes.spring5.service;

import com.DanceBytes.spring5.dao.UserDao;
import com.DanceBytes.spring5.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 孟享广
 * @date 2020-11-11 3:11 下午
 * @description
 */
//在注解里面value属性值可以省略不写，
//默认值是类名称，首字母小写
//UserService -- userService
//@Component(value = "userService")  //<bean id="userService" class=".."/>

//@Component(value = "userService")
//@Component
@Service
//@Controller
//@Repository
public class UserService {
    //定义dao类型属性 不需要添加set方法
    //添加注入属性注解
    @Autowired//根据 类型 进行注入
    @Qualifier(value = "userDaoImpl1")//根据 名称 进行注入
    private UserDao userDao;//UserDao可以有多个接口的实现类

    @Value(value = "abc")
    private String name;

    public void add() {
        System.out.println("UserService add()..." + name);
        userDao.add();
    }

}
