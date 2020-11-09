package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.collectiontype.Book;
import com.DanceBytes.spring5.collectiontype.Course;
import com.DanceBytes.spring5.collectiontype.Stu;
import com.DanceBytes.spring5.facbean.MyBean;
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
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.show();
    }
        @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
         Course course = context.getBean("myBean", Course.class);
         System.out.println(course);
    }



}
