package com.zhjava.lesson02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //第 1 问
       /* MotoVehicle m=new Bus(16);
        System.out.println("Bus租金："+m.calcRent(30));

        MotoVehicle m1=new Car("宝马550i");
        System.out.println("Car租金："+m1.calcRent(20));*/

        //第 2 问
        MotoVehicle[] mm=new MotoVehicle[]{
                new Car("NY28588","宝马550i"),
                new Car("京NNN328","宝马550i"),
                new Car("京NNN328","别克林荫大道"),
                new Bus(34)
        };
        Client client = new Client();
        System.out.println( "总租金为："+client.calTotalRent(mm,5));

        //第 3 问：计算汽车租赁的总租金
        /*Scanner sc=new Scanner(System.in);
        Client c=new Client();

        int total=0;//总租金

         do{
             System.out.println("==================欢迎来到汽车租赁系统================");
             System.out.println("请选择要租赁的车型\n1、别克商务舱GL8（600/天)\n2、宝马550i(500)\n3、别克林荫大道(300)\n4、客车金杯<=16座(800/天)\n5、客车金龙>16座(1500/天)\n6、卡车(50/吨/天)\n");
             System.out.println("==================================================");
             System.out.print("请选择：");
             int choose = sc.nextInt();
             switch (choose){
                 case 1:
                     System.out.println("您选择的是别克商务舱GL8......");
                     System.out.print("请输入租赁天数:");
                     int dayCar=sc.nextInt();

                     MotoVehicle m11 = new Car("别克商务舱GL8");
                     System.out.println("别克商务舱GL8租金为："+ c.calAllPrices(m11,dayCar)+"元");
                    total+=c.calAllPrices(m11,dayCar);
                     break;
                 case 2:
                     System.out.println("您选择的是宝马550i(500)......");
                     System.out.print("请输入租赁天数:");
                     int dayCar2=sc.nextInt();

                     MotoVehicle m22 = new Car("宝马550i");
                     System.out.println("宝马550i租金为："+c.calAllPrices(m22,dayCar2)+"元");
                     total+=c.calAllPrices(m22,dayCar2);
                     break;
                 case 3:
                     System.out.println("您选择的是别克林荫大道(300)......");
                     System.out.print("请输入租赁天数:");
                     int dayCar3=sc.nextInt();

                     MotoVehicle m33 = new Car("别克林荫大道");
                     System.out.println("别克林荫大道(300)租金为："+c.calAllPrices(m33,dayCar3)+"元");
                    total+=c.calAllPrices(m33,dayCar3);
                     break;
                 case 4:
                     System.out.println("您选择的是客车金杯<=16座(800/天)......");
                     System.out.print("请输入租赁天数:");
                     int dayCar4=sc.nextInt();
                     System.out.print("请输入要租赁的座位数：");
                     int seatCount=sc.nextInt();
                     while(seatCount>16){
                         System.out.print("请输入要租赁的座位数：");
                         seatCount=sc.nextInt();
                     }
                     MotoVehicle m44 = new Bus(seatCount);
                     System.out.println("客车金杯"+seatCount+"座租金："+c.calAllPrices(m44,dayCar4)+"元");
                     total+=c.calAllPrices(m44,dayCar4);
                     break;
                 case 5:
                     System.out.println("您选择的是客车金龙>16座(1500/天)......");
                     System.out.print("请输入租赁天数:");
                     int dayCar5=sc.nextInt();
                     System.out.print("请输入要租赁的座位数：");
                     int seatCount5=sc.nextInt();
                     while(seatCount5<=16){
                         System.out.print("请输入要租赁的座位数：");
                         seatCount5=sc.nextInt();
                     }
                     MotoVehicle m55 = new Bus(seatCount5);
                     System.out.println("客车金龙"+seatCount5+"座租金为："+c.calAllPrices(m55,dayCar5));
                    total+=c.calAllPrices(m55,dayCar5);
                     break;
                 case 6:
                     System.out.println("您选择的是卡车(50/吨/天)......");
                     System.out.print("请输入租赁天数:");
                     int dayCar6=sc.nextInt();
                     System.out.print("请输入吨位：");
                     int dun=sc.nextInt();

                     MotoVehicle m66 = new Truck(dun);

                     System.out.println("卡车总租金："+c.calAllPrices(m66,dayCar6)+"元");
                     total+=c.calAllPrices(m66,dayCar6);
                     break;
                 default:
                     System.out.println("抱歉，没有该车型");
                     System.exit(0);

             }
             System.out.println("总租金为："+total);
         }while(true);*/
    }
}
