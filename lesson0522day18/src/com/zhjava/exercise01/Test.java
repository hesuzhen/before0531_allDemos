package com.zhjava.exercise01;

import com.zhjava.lesson03.Username;

import java.util.Scanner;

class User{
    String [] names=new String[20];
    //�ͻ����������
    public void addName(){
        Scanner sc= new Scanner(System.in);
        String answer="y";
        while("y".equals(answer)){
            System.out.print("������ͻ���������");
            String  name = sc.next();
            for (int i = 0; i < names.length; i++) {
                if(names[i]==null){
                    names[i]=name;
                    break;
                }
            }
            System.out.print("���������𣿣�y/n��:");
           answer=sc.next();
        }
        System.out.println("*************************************");
        System.out.println("\t\t\t�ͻ������б�");
        System.out.println("*************************************");
        for (int i = 0; i <names.length ; i++) {
            if(names[i]!=null){
                System.out.print(names[i]+" ");
            }
        }

    }
    //���οͻ��������
    public void addName2(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    //�ͻ���������ʾ
    public void showName(){
        System.out.println("*************************************");
        System.out.println("\t\t\t�ͻ������б�");
        System.out.println("*************************************");
        for (int a = 0; a < names.length; a++) {
            if(names[a]!=null){
                System.out.print(names[a]+" ");
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        User user = new User();
       // user.addName();

        Scanner sc= new Scanner(System.in);
        String answer="y";
        while("y".equals(answer)){
            System.out.print("������ͻ���������");
            String  name = sc.next();
            user.addName2(name);
            System.out.print("���������𣿣�y/n��:");
            answer=sc.next();
        }
        user.showName();
    }
}
