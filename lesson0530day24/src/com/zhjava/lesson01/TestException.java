package com.zhjava.lesson01;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        //�����±��쳣
        /*int [] array1=new int[1];
        array1[0]=1;
        array1[1]=4;
        System.out.println(array1[1]);*/

        //����ת���쳣
       /* String s=new String("����");
        Object obj=s;
        int a=(int)obj;*/

        //�������Ͳ�ƥ���쳣
       /* Scanner sc=new Scanner(System.in);
        System.out.print("���뱻������");
        int b = sc.nextInt();
        System.out.print("���������");
        int c=sc.nextInt();*/

        //��ѧ�쳣
          Scanner sc=new Scanner(System.in);
        System.out.print("���뱻������");
        int b = sc.nextInt();
        System.out.print("���������");
        int c=sc.nextInt();
        int d=b/c;
        System.out.println(d);
    }
}
