package com.zhjava.lesson01;

public class TestMethod {
    int a=10;//全局变量
   public static  int b;
    //局部变量和全局变量
    public static void main(String[] args) {
        int a=20;//局部变量

        System.out.println(a);
        System.out.println(b);
        System.out.println("*********有参构造、无参构造**************");
        Student student = new Student();
        Student student1 = new Student("zhangsan",15);
        student1.show();

    }
}
