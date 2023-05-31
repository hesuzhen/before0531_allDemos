package com.zhjava.exercise04;

import com.zhjava.exercise04.Address;

public class Worker {
    private String name;
    private int age;
    private double salary;
    private Address addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(){}
    public Worker(String name, int age, double salary,Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr=addr;
    }
    //无参work方法
    public void work(){

    }
    //有参work方法
    public void work(int hours){

    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    public String show(){

        return "姓名："+name+"，年龄："+age+",薪资："+salary;
    }
}

