package com.zhjava.random01;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //��ӡ��ֱ��������
        Scanner sc=new Scanner(System.in);
        System.out.print("������ֱ�������ε�������");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
