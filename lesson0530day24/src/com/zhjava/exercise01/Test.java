package com.zhjava.exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("������γ̴��ţ�1-3֮������֣���");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("C#�γ�");
                    break;
                case 2:
                    System.out.println("java�γ�");
                    break;
                case 3:
                    System.out.println("Python�γ�");
                    break;
                default:
                    System.out.println("û����ؿγ̡�������");
                    break;
            }
        }catch(InputMismatchException i){

            System.out.println("�Ƿ����롣����");


        }finally {
            System.out.println("��ӭ������飡");
        }

    }
}
