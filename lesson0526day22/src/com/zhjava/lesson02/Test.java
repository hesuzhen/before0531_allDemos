package com.zhjava.lesson02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //�� 1 ��
       /* MotoVehicle m=new Bus(16);
        System.out.println("Bus���"+m.calcRent(30));

        MotoVehicle m1=new Car("����550i");
        System.out.println("Car���"+m1.calcRent(20));*/

        //�� 2 ��
        MotoVehicle[] mm=new MotoVehicle[]{
                new Car("NY28588","����550i"),
                new Car("��NNN328","����550i"),
                new Car("��NNN328","���������"),
                new Bus(34)
        };
        Client client = new Client();
        System.out.println( "�����Ϊ��"+client.calTotalRent(mm,5));

        //�� 3 �ʣ������������޵������
        /*Scanner sc=new Scanner(System.in);
        Client c=new Client();

        int total=0;//�����

         do{
             System.out.println("==================��ӭ������������ϵͳ================");
             System.out.println("��ѡ��Ҫ���޵ĳ���\n1����������GL8��600/��)\n2������550i(500)\n3�����������(300)\n4���ͳ���<=16��(800/��)\n5���ͳ�����>16��(1500/��)\n6������(50/��/��)\n");
             System.out.println("==================================================");
             System.out.print("��ѡ��");
             int choose = sc.nextInt();
             switch (choose){
                 case 1:
                     System.out.println("��ѡ����Ǳ�������GL8......");
                     System.out.print("��������������:");
                     int dayCar=sc.nextInt();

                     MotoVehicle m11 = new Car("��������GL8");
                     System.out.println("��������GL8���Ϊ��"+ c.calAllPrices(m11,dayCar)+"Ԫ");
                    total+=c.calAllPrices(m11,dayCar);
                     break;
                 case 2:
                     System.out.println("��ѡ����Ǳ���550i(500)......");
                     System.out.print("��������������:");
                     int dayCar2=sc.nextInt();

                     MotoVehicle m22 = new Car("����550i");
                     System.out.println("����550i���Ϊ��"+c.calAllPrices(m22,dayCar2)+"Ԫ");
                     total+=c.calAllPrices(m22,dayCar2);
                     break;
                 case 3:
                     System.out.println("��ѡ����Ǳ��������(300)......");
                     System.out.print("��������������:");
                     int dayCar3=sc.nextInt();

                     MotoVehicle m33 = new Car("���������");
                     System.out.println("���������(300)���Ϊ��"+c.calAllPrices(m33,dayCar3)+"Ԫ");
                    total+=c.calAllPrices(m33,dayCar3);
                     break;
                 case 4:
                     System.out.println("��ѡ����ǿͳ���<=16��(800/��)......");
                     System.out.print("��������������:");
                     int dayCar4=sc.nextInt();
                     System.out.print("������Ҫ���޵���λ����");
                     int seatCount=sc.nextInt();
                     while(seatCount>16){
                         System.out.print("������Ҫ���޵���λ����");
                         seatCount=sc.nextInt();
                     }
                     MotoVehicle m44 = new Bus(seatCount);
                     System.out.println("�ͳ���"+seatCount+"�����"+c.calAllPrices(m44,dayCar4)+"Ԫ");
                     total+=c.calAllPrices(m44,dayCar4);
                     break;
                 case 5:
                     System.out.println("��ѡ����ǿͳ�����>16��(1500/��)......");
                     System.out.print("��������������:");
                     int dayCar5=sc.nextInt();
                     System.out.print("������Ҫ���޵���λ����");
                     int seatCount5=sc.nextInt();
                     while(seatCount5<=16){
                         System.out.print("������Ҫ���޵���λ����");
                         seatCount5=sc.nextInt();
                     }
                     MotoVehicle m55 = new Bus(seatCount5);
                     System.out.println("�ͳ�����"+seatCount5+"�����Ϊ��"+c.calAllPrices(m55,dayCar5));
                    total+=c.calAllPrices(m55,dayCar5);
                     break;
                 case 6:
                     System.out.println("��ѡ����ǿ���(50/��/��)......");
                     System.out.print("��������������:");
                     int dayCar6=sc.nextInt();
                     System.out.print("�������λ��");
                     int dun=sc.nextInt();

                     MotoVehicle m66 = new Truck(dun);

                     System.out.println("���������"+c.calAllPrices(m66,dayCar6)+"Ԫ");
                     total+=c.calAllPrices(m66,dayCar6);
                     break;
                 default:
                     System.out.println("��Ǹ��û�иó���");
                     System.exit(0);

             }
             System.out.println("�����Ϊ��"+total);
         }while(true);*/
    }
}
