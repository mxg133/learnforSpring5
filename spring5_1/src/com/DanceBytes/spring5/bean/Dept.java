package com.DanceBytes.spring5.bean;

/**
 * @author 孟享广
 * @date 2020-11-08 8:43 上午
 * @description
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
