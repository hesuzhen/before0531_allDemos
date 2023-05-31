package com.zhjava.lesson03;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("hahhah");
        stu.setAge(15);
        String name = stu.getName();
        int age = stu.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
