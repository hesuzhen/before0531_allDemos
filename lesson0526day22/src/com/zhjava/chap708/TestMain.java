package com.zhjava.chap708;

class MyClass {
    public void printValue(final int value){
        System.out.println(value);
    }
    public void changeValue(int value){
        value = value * 2;
        System.out.println(value);
    }
}
public class TestMain{
    public static void main(String args[]){
        MyClass mc = new MyClass();
        int value = 5;
        final int fvalue = 10;
        mc.printValue(value); //1
        mc.printValue(fvalue); //2
        mc.changeValue(value); //3
        mc.changeValue(fvalue);//4
    }
}
