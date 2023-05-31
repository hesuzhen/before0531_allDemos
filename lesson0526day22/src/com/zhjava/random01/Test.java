package com.zhjava.random01;

public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("张三",15);
        Student stu2 = new Student("张三", 15);
        System.out.println(stu1.equals(stu2));
    }
}
