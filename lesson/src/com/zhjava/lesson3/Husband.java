package com.zhjava.lesson3;

public class Husband {
    //丈夫类
    String name;
    int age;
    Wife wife;
    public void getInfo(){
        System.out.println("姓名："+name+",年龄："+age+",妻子姓名："+wife.name+",妻子年龄："+wife.age);
    }
}
