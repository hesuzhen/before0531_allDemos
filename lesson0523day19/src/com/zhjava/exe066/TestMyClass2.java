package com.zhjava.exe066;

//TestMyClass2.java

import com.zhjava.exe06.MyClass;

public class TestMyClass2{
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        mc1.setValue(10);
       //MyClass mc2 = new MyClass(10);
        System.out.println(mc1.getValue());
        //System.out.println(mc2.value);
    }
}