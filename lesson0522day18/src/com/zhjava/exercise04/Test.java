package com.zhjava.exercise04;

import java.util.Scanner;

class Account{
    int balance;//账户余额
    //存款
    public void StorageMoney(int money){

        balance+=money;
        System.out.println("存款成功");
        System.out.println("******当前余额为："+balance+"元******");
    }
    //取款
    public void outMoney(int money){

        if(balance>0){
            balance-=money;
            System.out.println("******当前余额为："+balance+"元******");
        }else{
            System.out.println("余额不足");
        }

    }
}
public class Test {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("************银行账户业务************");
            System.out.println("1、存款\n2、取款\n0、退出");
            System.out.println("**********************************");
            System.out.print("请选择您需要办理的业务：");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.print("请输入存款金额：");
                    int addMoney = sc.nextInt();
                    account.StorageMoney(addMoney);
                    break;
                case 2:
                    System.out.println("取款");
                    System.out.print("请输入取款金额：");
                    int outMoney= sc.nextInt();
                    account.outMoney(outMoney);
                    break;
                case 0:

                    System.out.println("谢谢使用！");
                    return ;
                //break;
                default:
                    System.out.println("抱歉，没有该项业务！");
                    break;
            }
        }

    }
}
