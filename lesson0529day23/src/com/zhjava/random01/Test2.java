package com.zhjava.random01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入倒直角三角形的行数：");
        int rows= sc.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
