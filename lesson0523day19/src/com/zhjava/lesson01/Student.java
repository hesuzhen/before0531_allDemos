package com.zhjava.lesson01;

public class Student {
    String name;
    int age;
    public Student(){
        //this(name);
        System.out.println("�����޲ι��췽��");
    }
    public Student(String name){

        System.out.println("�����вι��췽��");
    }
    public Student(String name,int age){
       // this(name);
        this.name=name;
        this.age=age;
        System.out.println("�����вι��췽��");
    }
    public void show(){
        System.out.println("������"+name+",���䣺"+age);
    }
    public void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum��"+sum);
    }
    public int sum(int a,String b){
      int c=b.equals("hhh")?1:2;
      int sum=c+a;
        return sum;
    }
}
