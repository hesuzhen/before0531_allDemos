package com.zhjava.lesson01;

public class Student {
    String name;
    int age;
    public Student(){
        //this(name);
        System.out.println("我是无参构造方法");
    }
    public Student(String name){

        System.out.println("我是有参构造方法");
    }
    public Student(String name,int age){
       // this(name);
        this.name=name;
        this.age=age;
        System.out.println("我是有参构造方法");
    }
    public void show(){
        System.out.println("姓名："+name+",年龄："+age);
    }
    public void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum："+sum);
    }
    public int sum(int a,String b){
      int c=b.equals("hhh")?1:2;
      int sum=c+a;
        return sum;
    }
}
