package com.zhjava.random01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("��������ε�������");
        int rows=sc.nextInt();
        System.out.print("��������ε�������");
        int colspans=sc.nextInt();
        //��ѭ������ʾ��
        for (int i = 1; i <= rows; i++) {
            //��ѭ������ʾÿ�����������
            for (int j = 0; j < colspans; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
