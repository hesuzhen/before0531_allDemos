package com.zhjava.lesson03;

import java.util.InputMismatchException;

public class TestThrows {
    //�����쳣
    public static void main(String[] args) {
        try{
            int cal = TestThrows.cal(4, 0);
            System.out.println(cal);

        }catch (Exception e){
            System.out.println("�쳣����������");

        }

    }
    //�����ʱ��д��һ�������������������Ҳ������쳣�������ǿ����׳��쳣
    public static  int cal(int a,int b)throws ArithmeticException, InputMismatchException {
        int result=a/b;
        return result;
    }
}
