package com.zhjava.lesson02;

public class Student {
    //static��ʹ��
    String name;
    int age;
    static String country;//��̬����
    public Student(){}
    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public void show(){
        System.out.println("������������");
        show2();
        show3();
    }
    public static void show2(){
        Student student = new Student();
        student.show();
        System.out.println("���Ǿ�̬����");
    }
    public static void show3(){
        System.out.println("���Ǿ�̬����2");
    }


    public void show4() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}');

    }
}
