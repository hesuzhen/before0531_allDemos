package com.zhjava.chap709;

class MyValue{
    int value;
}
public class TestFinal{
    public static void main(String args[]){
        final MyValue mv = new MyValue();
        mv.value = 100;
//1
        System.out.println(mv.value);
    }

}
