package com.zhjava.exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("请输入课程代号（1-3之间的数字）：");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("C#课程");
                    break;
                case 2:
                    System.out.println("java课程");
                    break;
                case 3:
                    System.out.println("Python课程");
                    break;
                default:
                    System.out.println("没有相关课程。。。。");
                    break;
            }
        }catch(InputMismatchException i){

            System.out.println("非法输入。。。");


        }finally {
            System.out.println("欢迎提出建议！");
        }

    }
}
