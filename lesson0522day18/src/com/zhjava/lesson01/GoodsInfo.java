package com.zhjava.lesson01;

import java.util.Scanner;

public class GoodsInfo {
    //餐品类
    //订餐人
    String [] names=new String[4];
    //餐品信息
    String [] goodsInfo=new String[4];
    //菜名
    String [] goodsName=new String[4];
    //单价
    double [] perPrice=new double[4];
    //送餐日期
    String [] sendGoodDate=new String[4];
    //送餐地址
    String [] sendGoodAddress=new String[4];
    //总金额
    String [] totalFee=new String[4];
    //订单状态个数，有几个状态
    //int status=1;//1：表示已预订，2：表示已完成
    int [] status=new int [4];
    //赞数
    int [] zanshu=new int[4];
    public void orderDish(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入订餐人姓名：");
        String orderName=sc.next();
        //遍历输出菜单
        System.out.println("序号\t\t菜名\t\t单价");
        for(int i=0;i<goodsName.length-1;i++){
            System.out.println((i+1)+"\t\t"+goodsName[i]+"\t"+perPrice[i]+"元");

        }
        System.out.print("请选择您要点的菜品编号：");
        int goodsNum=sc.nextInt();
        if(goodsNum>3){
            System.out.println("对不起，没有该餐品！");
        }
        System.out.print("请选择您需要的份数：");
        int needNum=sc.nextInt();
        System.out.print("请输入送餐时间（送餐时间是10点~20点间整点送餐）：");
        int sendTime=sc.nextInt();
        while(sendTime<10 || sendTime>20){
            System.out.print("您的输入有误，请输入10~20间的整数！ ：");
            sendTime=sc.nextInt();
        }
        System.out.print("请输入送餐地址：");
        String address=sc.next();
        //把用户输入的订餐信息存到数组
        //姓名、菜名+份数、送餐日期、地址、总金额、订单状态（默认已预订）
        //循环遍历数组，找到空的就存进去
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=orderName;
                goodsInfo[i]=goodsName[goodsNum-1]+" "+needNum+"份";
                sendGoodDate[i]=sendTime+"点";
                sendGoodAddress[i]=address;
                totalFee[i]=(perPrice[goodsNum-1]*needNum)+"元";
                status[i]=1;
                break;
            }

        }
							/*测试是否成功存入数组
							for(int i=0;i<names.length;i++){
								System.out.println(goodsInfo[i]+" ");
								//System.out.println(sendGoodDate[i]+" ");
								//System.out.println(sendGoodAddress[i]+" ");
								//System.out.println(totalFee[i]+" ");
							}*/

        System.out.println("订餐成功！");
        OrderChmod orderChmod = new OrderChmod();
        orderChmod.count--;
        //餐费
        double dishPrice=perPrice[goodsNum-1]*needNum;
        //送餐费
        double sendPrice=dishPrice>40?0:5;
        System.out.println("您订的是："+goodsName[goodsNum-1]+" "+needNum+"份");
        System.out.println("送餐时间："+sendTime);
        System.out.println("餐费："+dishPrice+"元，送餐费："+sendPrice+"，总计："+(dishPrice+sendPrice)+"元");
        System.out.println("数组长度："+names.length);
    }
    //查看餐袋
    public void lookPackage(){
        System.out.println("***查看餐袋***");
        System.out.println("序号\t订餐人\t餐品信息\t送餐日期\t送餐地址\t总金额\t订单状态");
        //循环遍历数组显示餐袋信息
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){

                System.out.println((i+1)+"\t"+names[i]+"\t"+goodsInfo[i]+"\t"+sendGoodDate[i]+"\t\t"+sendGoodAddress[i]+"\t"+totalFee[i]+"\t"+(status[i]==1?"已预订":"已完成"));
            }
        }
    }
    //签收订单
    public void signOrder(int signId){
        if(signId>4){
            System.out.println("您选择的订单不存在！");
        }else{
            //订单存在
            //判断是不是已经签收过：根据他的状态判断
            if(status[signId-1]==2){
                System.out.println("您选择的订单已经完成签收，不能再次签收！");
            }else{
                //没有被签收过，则更改状态
                status[signId-1]=2;
                System.out.println("订单签收成功！");
            }
        }
    }
    public void delOrder(int delId){
        if(delId>4){
            System.out.println("您要删除的订单不存在");
        }else{
            //订单存在的情况
            //判断订单虽然存在，有没有被签收，只有已完成状态的订单才能被删除
            if(status[delId-1]==1){
                System.out.println("您选择的订单未被签收，不能删除！");
            }else if(status[delId-1]==2){
                //订单是已完成状态，此时可以删除
                //这里要真的从数组中把数据删除
                //下标：ordernum- 1
                //从前往后挪位置
                for(int i=delId-1;i<names.length-1;i++){
                    //后一个给前一个
                    names[i]=names[i+1];
                    goodsInfo[i]=goodsInfo[i+1];
                    sendGoodDate[i]=sendGoodDate[i+1];
                    sendGoodAddress[i]=sendGoodAddress[i+1];
                    totalFee[i]=totalFee[i+1];
                    status[i]=status[i+1];
                }
                //清除重复的最后一个元素
                names[names.length-1]=null;
                goodsInfo[names.length-1]=null;
                sendGoodDate[names.length-1]=null;
                sendGoodAddress[names.length-1]=null;
                totalFee[names.length-1]=null;
                status[status.length-1]=1;
                OrderChmod orderChmod = new OrderChmod();
                orderChmod.count++;
							/*
							System.out.println("count:"+count);
							//遍历检测一下
							for(int i=0;i<names.length;i++){
								System.out.println(names[i]);
							}*/
                System.out.println("订单删除成功！");
            }

        }
    }
    //点赞
    public void dianZan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("***我要点赞***");
        System.out.println("序号\t\t菜名\t\t单价");
        for(int i=0;i<goodsName.length-1;i++){
            System.out.println((i+1)+"\t\t"+goodsName[i]+"\t"+perPrice[i]+"元"+"\t"+zanshu[i]+"赞");

        }
        System.out.print("请选择您要点赞的菜品序号：");
        int zanId=sc.nextInt();
        while(zanId>3){

            System.out.print("没有该类菜品，请重新输入! ：");
            zanId=sc.nextInt();
        }
        zanshu[zanId-1]+=1;
        System.out.println("点赞成功！");
    }
}
