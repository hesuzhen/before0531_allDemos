package com.zhjava.exercise04;

import java.util.Scanner;

class Account{
    int balance;//�˻����
    //���
    public void StorageMoney(int money){

        balance+=money;
        System.out.println("���ɹ�");
        System.out.println("******��ǰ���Ϊ��"+balance+"Ԫ******");
    }
    //ȡ��
    public void outMoney(int money){

        if(balance>0){
            balance-=money;
            System.out.println("******��ǰ���Ϊ��"+balance+"Ԫ******");
        }else{
            System.out.println("����");
        }

    }
}
public class Test {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("************�����˻�ҵ��************");
            System.out.println("1�����\n2��ȡ��\n0���˳�");
            System.out.println("**********************************");
            System.out.print("��ѡ������Ҫ�����ҵ��");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.print("���������");
                    int addMoney = sc.nextInt();
                    account.StorageMoney(addMoney);
                    break;
                case 2:
                    System.out.println("ȡ��");
                    System.out.print("������ȡ���");
                    int outMoney= sc.nextInt();
                    account.outMoney(outMoney);
                    break;
                case 0:

                    System.out.println("ллʹ�ã�");
                    return ;
                //break;
                default:
                    System.out.println("��Ǹ��û�и���ҵ��");
                    break;
            }
        }

    }
}
