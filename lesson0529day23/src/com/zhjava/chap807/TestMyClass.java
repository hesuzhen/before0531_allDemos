package com.zhjava.chap807;

interface IA{
    void m1();
}
class IAImpl1 implements IA{
    public void m1(){
        System.out.println("impl1");
    }
}
class IAImpl2 implements IA{
    public void m1(){
        System.out.println("impl2");
    }
}
class MyClass{
    private IA ia;
    public MyClass(IA ia){
        this.ia = ia;
    }
    public void setIa(IA ia){
        this.ia = ia;
    }
    public void myMethod(){
        ia.m1();
    }
}
public class TestMyClass{
    public static void main(String args[]){
        IA ia1 = new IAImpl1();
        MyClass mc = new MyClass(ia1);
        mc.myMethod();
        IA ia2 = new IAImpl2();
        mc.setIa(ia2);
        mc.myMethod();
    }
}