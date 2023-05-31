package com.zhjava.lesson01;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(001, "张三", 21);
        Student s2= new Student(001,"张三",21);
        System.out.println(s1.equals(s2));
    }
}
