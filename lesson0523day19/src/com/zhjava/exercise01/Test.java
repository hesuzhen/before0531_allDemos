package com.zhjava.exercise01;

public class Test {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca=getObject();
        ca=getObject();
        ca=getObject();
        System.out.println(ca.value);
    }
    public static ClassA getObject(){
        ClassA newobject = new ClassA();
        newobject.value+=10;
        return newobject;
    }
}
