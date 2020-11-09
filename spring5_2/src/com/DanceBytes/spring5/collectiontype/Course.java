package com.DanceBytes.spring5.collectiontype;

/**
 * @author 孟享广
 * @date 2020-11-09 5:09 下午
 * @description
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
