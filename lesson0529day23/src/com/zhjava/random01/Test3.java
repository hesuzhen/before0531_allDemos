package com.zhjava.random01;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("������������������");
        int rows = sc.nextInt();
        //��ѭ��������
        for (int i = 1; i <=rows; i++) {
            //��ѭ�����ո�
            for (int j = 1; j <=rows-i; j++) {
                System.out.print("#");
            }
            //��ѭ��������
            for (int a = 1; a <=2*i-1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
