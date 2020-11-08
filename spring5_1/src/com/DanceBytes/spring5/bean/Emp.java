package com.DanceBytes.spring5.bean;

/**
 * @author 孟享广
 * @date 2020-11-08 8:44 上午
 * @description
 */
public class Emp {
    private String ename;
    private String gender;

    //
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println(ename+gender+dept);
    }
}
