package com.zhjava.exercise01;

import com.zhjava.lesson03.Username;

import java.util.Scanner;

class User{
    String [] names=new String[20];
    //客户姓名的添加
    public void addName(){
        Scanner sc= new Scanner(System.in);
        String answer="y";
        while("y".equals(answer)){
            System.out.print("请输入客户的姓名：");
            String  name = sc.next();
            for (int i = 0; i < names.length; i++) {
                if(names[i]==null){
                    names[i]=name;
                    break;
                }
            }
            System.out.print("继续输入吗？（y/n）:");
           answer=sc.next();
        }
        System.out.println("*************************************");
        System.out.println("\t\t\t客户姓名列表");
        System.out.println("*************************************");
        for (int i = 0; i <names.length ; i++) {
            if(names[i]!=null){
                System.out.print(names[i]+" ");
            }
        }

    }
    //带参客户姓名添加
    public void addName2(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    //客户姓名的显示
    public void showName(){
        System.out.println("*************************************");
        System.out.println("\t\t\t客户姓名列表");
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
            System.out.print("请输入客户的姓名：");
            String  name = sc.next();
            user.addName2(name);
            System.out.print("继续输入吗？（y/n）:");
            answer=sc.next();
        }
        user.showName();
    }
}
