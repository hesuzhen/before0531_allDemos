package com.zhjava.random01;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入三角形行数：");
        int rows = sc.nextInt();
        //外循环：行数
        for (int i = 1; i <=rows; i++) {
            //内循环：空格
            for (int j = 1; j <=rows-i; j++) {
                System.out.print("#");
            }
            //内循环：星星
            for (int a = 1; a <=2*i-1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
