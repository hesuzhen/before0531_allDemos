package com.zhjava.chap624;

public class Employee {
    //所有员工总的父类
    private String name;//姓名
    private int month;//员工的生日月份

    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getSalary(int month){
        //员工过生日，则公司会额外奖励100 元

        return 0;
    }
}
