package com.zhjava.lesson01;

import java.util.*;

public class OrderChmod {
    public static int count=4-2;//�����жϵ�ǰ�ʹ�Ϊ������
    //�㵥ϵͳ
    public static void main(String [] args){

        //��ʼ���ʹ���Ϣ
        //������

        GoodsInfo goodsInfo2 = new GoodsInfo();
        goodsInfo2.names[0]="����";
        goodsInfo2.names[1]="����";

        //��Ʒ��Ϣ
        goodsInfo2.goodsInfo[0]="���մ��� 2��";
        goodsInfo2.goodsInfo[1]="������˿ 2��";

        //����
        goodsInfo2.goodsName[0]="���մ���";
        goodsInfo2.goodsName[1]="������˿";
        goodsInfo2.goodsName[2]="ʱ������";
        //����
        goodsInfo2.perPrice[0]=38;
        goodsInfo2.perPrice[1]=20;
        goodsInfo2.perPrice[2]=10;
        //�Ͳ�����
        goodsInfo2.sendGoodDate[0]="12��";
        goodsInfo2.sendGoodDate[1]="18��";
        //�Ͳ͵�ַ
        goodsInfo2.sendGoodAddress[0]="����·83��";
        goodsInfo2.sendGoodAddress[1]="����·16��";
        //�ܽ��
        goodsInfo2.totalFee[0]="76.8Ԫ";
        goodsInfo2.totalFee[1]="20.0Ԫ";
        //����״̬�������м���״̬
        //int status=1;//1����ʾ��Ԥ����2����ʾ�����

        goodsInfo2.status[0]=2;
        goodsInfo2.status[1]=1;
        //int status==1?"��Ԥ��":"�����";

        //����

        int isZero=0;
        //int index=names.length-1;//����Ҫɾ���������ڲ����ݵ��±������һ��
        System.out.println("��ӭʹ��\"�Ի�����ϵͳ\"");
        do{
            System.out.println("*********************************");
            System.out.println("1����Ҫ����\n2���鿴�ʹ�\n3��ǩ�ն���\n4��ɾ������\n5����Ҫ����\n6���˳�ϵͳ");
            System.out.println("*********************************");
            Scanner sc=new Scanner(System.in);
            System.out.print("��ѡ��");
            int choose=sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("***��Ҫ����***");

                    if(count==0){
                        System.out.println("�Բ������Ĳʹ�������");
                    }else {

                        goodsInfo2.orderDish();
                    }
                    break;
                case 2:
                   goodsInfo2.lookPackage();
                    break;
                case 3:
                    System.out.println("***ǩ�ն���***");
                    System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
                    int signOrder=sc.nextInt();
                   goodsInfo2.signOrder(signOrder);
                    break;
                case 4:
                    System.out.println("***ɾ������***");
                    System.out.print("������Ҫɾ���Ķ�����ţ�");
                    int ordernum=sc.nextInt();
                   goodsInfo2.delOrder(ordernum);
                    break;
                case 5:
                    goodsInfo2.dianZan();
                    break;
                case 6:
                    System.out.println("ллʹ�ã���ӭ�´ι��٣�");
                    System.exit(0);
                    break;
                //�������
                default:
                    System.out.println("��Ǹ��û�����ѡ��......");
                    break;
            }
            System.out.print("����0���أ�");
            isZero=sc.nextInt();
            while(isZero!=0){
                System.out.print("����0���أ�");
                isZero=sc.nextInt();
            }

        }while(isZero==0);

    }

}