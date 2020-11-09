package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-09 4:57 下午
 * @description
 */
public class TestSpring5Demo1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.show();
    }
}
