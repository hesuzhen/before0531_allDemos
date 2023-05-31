package com.zhjava.random01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入矩形的行数：");
        int rows=sc.nextInt();
        System.out.print("请输入矩形的列数：");
        int colspans=sc.nextInt();
        //外循环：表示行
        for (int i = 1; i <= rows; i++) {
            //内循环：表示每行输出的内容
            for (int j = 0; j < colspans; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
