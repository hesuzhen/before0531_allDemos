package com.zhjava.lesson01;

public class TestMethod {
    int a=10;//ȫ�ֱ���
   public static  int b;
    //�ֲ�������ȫ�ֱ���
    public static void main(String[] args) {
        int a=20;//�ֲ�����

        System.out.println(a);
        System.out.println(b);
        System.out.println("*********�вι��졢�޲ι���**************");
        Student student = new Student();
        Student student1 = new Student("zhangsan",15);
        student1.show();

    }
}
