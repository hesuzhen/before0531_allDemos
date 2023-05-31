package com.zhjava.chap801;

interface IA{
    void m1();
    int a = 100;
}
class MyClass implements IA{

    public void m1(){}
}
public class TestInterface{
    public static void main(String args[]){
        IA ia = new MyClass();
        ia.m1();
        System.out.println(IA.a);
    }
}
