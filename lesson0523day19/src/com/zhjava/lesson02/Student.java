package com.zhjava.lesson02;

public class Student {
    //static的使用
    String name;
    int age;
    static String country;//静态属性
    public Student(){}
    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public void show(){
        System.out.println("哈哈哈哈哈哈");
        show2();
        show3();
    }
    public static void show2(){
        Student student = new Student();
        student.show();
        System.out.println("我是静态方法");
    }
    public static void show3(){
        System.out.println("我是静态方法2");
    }


    public void show4() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}');

    }
}
