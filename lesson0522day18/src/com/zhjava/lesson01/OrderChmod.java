package com.zhjava.lesson01;

import java.util.*;

public class OrderChmod {
    public static int count=4-2;//用于判断当前餐袋为空数量
    //点单系统
    public static void main(String [] args){

        //初始化餐袋信息
        //订餐人

        GoodsInfo goodsInfo2 = new GoodsInfo();
        goodsInfo2.names[0]="张晴";
        goodsInfo2.names[1]="张晴";

        //餐品信息
        goodsInfo2.goodsInfo[0]="红烧带鱼 2份";
        goodsInfo2.goodsInfo[1]="鱼香肉丝 2份";

        //菜名
        goodsInfo2.goodsName[0]="红烧带鱼";
        goodsInfo2.goodsName[1]="鱼香肉丝";
        goodsInfo2.goodsName[2]="时令鲜蔬";
        //单价
        goodsInfo2.perPrice[0]=38;
        goodsInfo2.perPrice[1]=20;
        goodsInfo2.perPrice[2]=10;
        //送餐日期
        goodsInfo2.sendGoodDate[0]="12日";
        goodsInfo2.sendGoodDate[1]="18日";
        //送餐地址
        goodsInfo2.sendGoodAddress[0]="湖南路83号";
        goodsInfo2.sendGoodAddress[1]="湖南路16号";
        //总金额
        goodsInfo2.totalFee[0]="76.8元";
        goodsInfo2.totalFee[1]="20.0元";
        //订单状态个数，有几个状态
        //int status=1;//1：表示已预订，2：表示已完成

        goodsInfo2.status[0]=2;
        goodsInfo2.status[1]=1;
        //int status==1?"已预订":"已完成";

        //赞数

        int isZero=0;
        //int index=names.length-1;//假设要删除的数组内部数据的下标是最后一个
        System.out.println("欢迎使用\"吃货联盟系统\"");
        do{
            System.out.println("*********************************");
            System.out.println("1、我要订餐\n2、查看餐袋\n3、签收订单\n4、删除订单\n5、我要点赞\n6、退出系统");
            System.out.println("*********************************");
            Scanner sc=new Scanner(System.in);
            System.out.print("请选择：");
            int choose=sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("***我要订餐***");

                    if(count==0){
                        System.out.println("对不起，您的餐袋已满！");
                    }else {

                        goodsInfo2.orderDish();
                    }
                    break;
                case 2:
                   goodsInfo2.lookPackage();
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    System.out.print("请选择要签收的订单序号：");
                    int signOrder=sc.nextInt();
                   goodsInfo2.signOrder(signOrder);
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    System.out.print("请输入要删除的订单序号：");
                    int ordernum=sc.nextInt();
                   goodsInfo2.delOrder(ordernum);
                    break;
                case 5:
                    goodsInfo2.dianZan();
                    break;
                case 6:
                    System.out.println("谢谢使用，欢迎下次光临！");
                    System.exit(0);
                    break;
                //其他情况
                default:
                    System.out.println("抱歉，没有这个选项......");
                    break;
            }
            System.out.print("输入0返回：");
            isZero=sc.nextInt();
            while(isZero!=0){
                System.out.print("输入0返回：");
                isZero=sc.nextInt();
            }

        }while(isZero==0);

    }

}