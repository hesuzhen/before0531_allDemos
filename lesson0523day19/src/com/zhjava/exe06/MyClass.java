package com.zhjava.exe06;

//MyClass.java

public class MyClass{
    private int value;
    public MyClass(){}
    MyClass(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}