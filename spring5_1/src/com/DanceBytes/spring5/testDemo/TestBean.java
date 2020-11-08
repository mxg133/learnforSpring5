package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.bean.Emp;
import com.DanceBytes.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-07 6:05 下午
 * @description
 */
public class TestBean {
    @Test
    public void test(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }


    @Test
    public void test2(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.show();
    }

        @Test
    public void test3(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.show();
    }



}
