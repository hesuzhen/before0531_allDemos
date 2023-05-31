package com.zhjava.exe06;

//TestMyClass1.java

public class TestMyClass1{
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass(10);
        System.out.println(mc1.getValue());
        System.out.println(mc2.getValue());
    }
}
