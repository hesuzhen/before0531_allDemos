package com.zhjava.lesson01;

import java.util.Scanner;

public class GoodsInfo {
    //��Ʒ��
    //������
    String [] names=new String[4];
    //��Ʒ��Ϣ
    String [] goodsInfo=new String[4];
    //����
    String [] goodsName=new String[4];
    //����
    double [] perPrice=new double[4];
    //�Ͳ�����
    String [] sendGoodDate=new String[4];
    //�Ͳ͵�ַ
    String [] sendGoodAddress=new String[4];
    //�ܽ��
    String [] totalFee=new String[4];
    //����״̬�������м���״̬
    //int status=1;//1����ʾ��Ԥ����2����ʾ�����
    int [] status=new int [4];
    //����
    int [] zanshu=new int[4];
    public void orderDish(){
        Scanner sc=new Scanner(System.in);
        System.out.print("�����붩����������");
        String orderName=sc.next();
        //��������˵�
        System.out.println("���\t\t����\t\t����");
        for(int i=0;i<goodsName.length-1;i++){
            System.out.println((i+1)+"\t\t"+goodsName[i]+"\t"+perPrice[i]+"Ԫ");

        }
        System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
        int goodsNum=sc.nextInt();
        if(goodsNum>3){
            System.out.println("�Բ���û�иò�Ʒ��");
        }
        System.out.print("��ѡ������Ҫ�ķ�����");
        int needNum=sc.nextInt();
        System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10��~20��������Ͳͣ���");
        int sendTime=sc.nextInt();
        while(sendTime<10 || sendTime>20){
            System.out.print("������������������10~20��������� ��");
            sendTime=sc.nextInt();
        }
        System.out.print("�������Ͳ͵�ַ��");
        String address=sc.next();
        //���û�����Ķ�����Ϣ�浽����
        //����������+�������Ͳ����ڡ���ַ���ܽ�����״̬��Ĭ����Ԥ����
        //ѭ���������飬�ҵ��յľʹ��ȥ
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=orderName;
                goodsInfo[i]=goodsName[goodsNum-1]+" "+needNum+"��";
                sendGoodDate[i]=sendTime+"��";
                sendGoodAddress[i]=address;
                totalFee[i]=(perPrice[goodsNum-1]*needNum)+"Ԫ";
                status[i]=1;
                break;
            }

        }
							/*�����Ƿ�ɹ���������
							for(int i=0;i<names.length;i++){
								System.out.println(goodsInfo[i]+" ");
								//System.out.println(sendGoodDate[i]+" ");
								//System.out.println(sendGoodAddress[i]+" ");
								//System.out.println(totalFee[i]+" ");
							}*/

        System.out.println("���ͳɹ���");
        OrderChmod orderChmod = new OrderChmod();
        orderChmod.count--;
        //�ͷ�
        double dishPrice=perPrice[goodsNum-1]*needNum;
        //�Ͳͷ�
        double sendPrice=dishPrice>40?0:5;
        System.out.println("�������ǣ�"+goodsName[goodsNum-1]+" "+needNum+"��");
        System.out.println("�Ͳ�ʱ�䣺"+sendTime);
        System.out.println("�ͷѣ�"+dishPrice+"Ԫ���Ͳͷѣ�"+sendPrice+"���ܼƣ�"+(dishPrice+sendPrice)+"Ԫ");
        System.out.println("���鳤�ȣ�"+names.length);
    }
    //�鿴�ʹ�
    public void lookPackage(){
        System.out.println("***�鿴�ʹ�***");
        System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�����\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
        //ѭ������������ʾ�ʹ���Ϣ
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){

                System.out.println((i+1)+"\t"+names[i]+"\t"+goodsInfo[i]+"\t"+sendGoodDate[i]+"\t\t"+sendGoodAddress[i]+"\t"+totalFee[i]+"\t"+(status[i]==1?"��Ԥ��":"�����"));
            }
        }
    }
    //ǩ�ն���
    public void signOrder(int signId){
        if(signId>4){
            System.out.println("��ѡ��Ķ��������ڣ�");
        }else{
            //��������
            //�ж��ǲ����Ѿ�ǩ�չ�����������״̬�ж�
            if(status[signId-1]==2){
                System.out.println("��ѡ��Ķ����Ѿ����ǩ�գ������ٴ�ǩ�գ�");
            }else{
                //û�б�ǩ�չ��������״̬
                status[signId-1]=2;
                System.out.println("����ǩ�ճɹ���");
            }
        }
    }
    public void delOrder(int delId){
        if(delId>4){
            System.out.println("��Ҫɾ���Ķ���������");
        }else{
            //�������ڵ����
            //�ж϶�����Ȼ���ڣ���û�б�ǩ�գ�ֻ�������״̬�Ķ������ܱ�ɾ��
            if(status[delId-1]==1){
                System.out.println("��ѡ��Ķ���δ��ǩ�գ�����ɾ����");
            }else if(status[delId-1]==2){
                //�����������״̬����ʱ����ɾ��
                //����Ҫ��Ĵ������а�����ɾ��
                //�±꣺ordernum- 1
                //��ǰ����Ųλ��
                for(int i=delId-1;i<names.length-1;i++){
                    //��һ����ǰһ��
                    names[i]=names[i+1];
                    goodsInfo[i]=goodsInfo[i+1];
                    sendGoodDate[i]=sendGoodDate[i+1];
                    sendGoodAddress[i]=sendGoodAddress[i+1];
                    totalFee[i]=totalFee[i+1];
                    status[i]=status[i+1];
                }
                //����ظ������һ��Ԫ��
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
							//�������һ��
							for(int i=0;i<names.length;i++){
								System.out.println(names[i]);
							}*/
                System.out.println("����ɾ���ɹ���");
            }

        }
    }
    //����
    public void dianZan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("***��Ҫ����***");
        System.out.println("���\t\t����\t\t����");
        for(int i=0;i<goodsName.length-1;i++){
            System.out.println((i+1)+"\t\t"+goodsName[i]+"\t"+perPrice[i]+"Ԫ"+"\t"+zanshu[i]+"��");

        }
        System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
        int zanId=sc.nextInt();
        while(zanId>3){

            System.out.print("û�и����Ʒ������������! ��");
            zanId=sc.nextInt();
        }
        zanshu[zanId-1]+=1;
        System.out.println("���޳ɹ���");
    }
}
