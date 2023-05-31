package com.zhjava.exercise06;

public class TestRef {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b ++ ;
        System.out.println(a);
        MyClass mc1 = new MyClass();
        mc1.value = 10;
        MyClass mc2 = mc1;
        mc2.value ++;
        System.out.println(mc1.value);
    }
}
