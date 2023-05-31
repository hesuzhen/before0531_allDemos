package com.zhjava.lesson2;
import java.util.Scanner;
public class Traveler {
    //游人测试类
    String name;
    int age;
    public void show(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("请输入姓名：");
            String scName=sc.next();
            if("n".equals(scName)){
                break;
            }else{
                System.out.print("请输入年龄：");
                int scAge=sc.nextInt();
                if(scAge<=12||scAge>=65){
                    System.out.println(scName+"的年龄为："+scAge+",门票免费");
                }else{
                    System.out.println(scName+"的年龄为："+scAge+",门票价格为：20元");
                }
            }

        }while(true);
        System.out.println("退出程序");


    }
}
