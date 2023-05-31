package com.zhjava.lesson03;

import java.util.InputMismatchException;

public class TestThrows {
    //上抛异常
    public static void main(String[] args) {
        try{
            int cal = TestThrows.cal(4, 0);
            System.out.println(cal);

        }catch (Exception e){
            System.out.println("异常。。。。。");

        }

    }
    //如果这时候写了一个方法，这个方法可能也会出现异常，那我们可以抛出异常
    public static  int cal(int a,int b)throws ArithmeticException, InputMismatchException {
        int result=a/b;
        return result;
    }
}
