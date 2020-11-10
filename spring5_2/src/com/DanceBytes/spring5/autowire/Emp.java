package com.DanceBytes.spring5.autowire;

/**
 * @author 孟享广
 * @date 2020-11-10 3:46 下午
 * @description
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void show() {
        System.out.println(dept);
    }
}
