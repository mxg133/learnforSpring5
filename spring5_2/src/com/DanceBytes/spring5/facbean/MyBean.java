package com.DanceBytes.spring5.facbean;

import com.DanceBytes.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 孟享广
 * @date 2020-11-09 5:52 下午
 * @description
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abx");

        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
