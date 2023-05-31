package com.zhjava.lesson4;
import java.util.Scanner;
public class Account {
    String cid;//卡号
    int password;//密码
    double balance;//余额
    Customer customer;//所属用户
    public String  getInfo(){

        return "卡号："+cid+",余额："+balance+"所属用户："+customer;
    }
    //取钱方法
    public boolean withdraw(){
        Scanner sc=new Scanner(System.in);
        while(!"q".equals(cid)){
            System.out.print("请输入取钱卡号：");
            cid=sc.next();
            if(!"q".equals(cid)){
                System.out.print("请输入卡号密码：");
                password=sc.nextInt();
                if("111".equals(cid)&&password==222){
                    System.out.println("登录成功");
                    if(customer.balance>0){
                        System.out.print("请输入取钱金额：");
                        int outPrice=sc.nextInt();
                        if(outPrice<customer.balance){
                            System.out.println("取钱成功！");
                            System.out.println("还剩："+(customer.balance-outPrice)+"元");
                            //return true;
                        }else{
                            System.out.println("余额不足");
                            //return  false;
                        }

                    }

                }else{
                    System.out.println("登录失败");
                    //return  false;
                }
            }

        }
        System.out.println("退出系统");

        return  false;
    }
    //存钱方法
    public boolean save(){
        Scanner sc=new Scanner(System.in);
        while(!"q".equals(cid)){
            System.out.print("请输入卡号：");
            cid=sc.next();
            System.out.print("请输入密码：");
            password=sc.nextInt();
            if(cid.equals(customer.cid)&&password==111){
                System.out.println("---请确认要存入账户"+cid+"信息---");
                System.out.println("账户名："+customer.name+",余额："+customer.balance);
                System.out.print("请输入要存的金额：");
                double storagePrice= sc.nextDouble();
                customer.balance+=storagePrice;
                System.out.println("存入成功");
                System.out.println("存入的金额为："+storagePrice+",账户余额为："+customer.balance);
                System.out.println("请选择：\n1、退出\n2、继续存储");
                int choose=sc.nextInt();
                switch(choose){
                    case 1:
                        return true;
                    // break;
                    case 2:
                        System.out.println("继续存储");
                        break;
                }
               // return true;
            }else{
                System.out.println("抱歉，卡号或密码不对！");
               // return false;
            }
        }



        return false;
    }
}
