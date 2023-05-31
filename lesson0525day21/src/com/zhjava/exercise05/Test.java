package com.zhjava.exercise05;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setZipCode("123");
        stu1.setAddress("ÖĞÑëÂ·");
        System.out.println(stu1.getPostAddress(stu1));
    }
}
