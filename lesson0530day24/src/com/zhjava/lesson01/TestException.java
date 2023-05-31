package com.zhjava.lesson01;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        //数组下标异常
        /*int [] array1=new int[1];
        array1[0]=1;
        array1[1]=4;
        System.out.println(array1[1]);*/

        //类型转换异常
       /* String s=new String("张三");
        Object obj=s;
        int a=(int)obj;*/

        //输入类型不匹配异常
       /* Scanner sc=new Scanner(System.in);
        System.out.print("输入被除数：");
        int b = sc.nextInt();
        System.out.print("输入除数：");
        int c=sc.nextInt();*/

        //数学异常
          Scanner sc=new Scanner(System.in);
        System.out.print("输入被除数：");
        int b = sc.nextInt();
        System.out.print("输入除数：");
        int c=sc.nextInt();
        int d=b/c;
        System.out.println(d);
    }
}
