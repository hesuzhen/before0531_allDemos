package com.zhjava.lesson02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            //�����ܳ����쳣�Ĳ��ַŵ�����
            System.out.print("���뱻������");
            int b = sc.nextInt();
            System.out.print("���������");
            int c=sc.nextInt();
            int d=b/c;
            System.out.println(d);
            return;

        }/*catch(Exception e){
            //Exception�Ǹ���
            //ִ��������ľͲ���ִ�и�������
            System.out.println("�����쳣����������");
        }*/catch(InputMismatchException i){//catch��׽�쳣
            System.out.println("���벻ƥ���쳣��������");
          /*  String m = i.getMessage();
            System.out.println(m);*/
            i.printStackTrace();


        }catch(ArithmeticException a){
            System.out.println("��ѧ�쳣��������");
            String message = a.getMessage();
            System.out.println(message);

            System.exit(-1);//����0�����쳣״̬
        }catch(Exception e){
            /*Exception�Ǹ���
                ִ��������ľͲ���ִ�и�������
                ����Ѵ�Χ������������棬��ô�ͻᱨ��ֻ�ܷ�������
                ���û�����ֻ࣬��Exception����ô��ִ��Exception�������
            */
            System.out.println("�����쳣����������");

        }finally {
            System.out.println("ллʹ�á���������");
        }
        System.out.println("�������");

    }
}
