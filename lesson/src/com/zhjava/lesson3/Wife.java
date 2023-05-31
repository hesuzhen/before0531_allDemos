package com.zhjava.lesson3;

public class Wife {
    String name;
    int age;
    Husband husband;
    public void show(){
        System.out.println("姓名："+name+",年龄："+age+",丈夫姓名："+husband.name+"丈夫年龄："+husband.age);
    }
}
