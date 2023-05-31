package com.zhjava.random01;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //打印倒直角三角形
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入直角三角形的行数：");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
