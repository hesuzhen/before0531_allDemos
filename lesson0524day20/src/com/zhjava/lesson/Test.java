package com.zhjava.lesson;

public class Test {
    //���ݵĴ���
    public static void main(String[] args) {
        //��ʾ1
        int a=10;
        int b=20;
        System.out.println("����ǰ��a="+a+",b="+b);
//        int temp=0;
//        temp=a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println("������a="+a+",b="+b);
        //����������д��������û���κ�����ģ���������Ҫ�ѽ�����ֵ�Ĺ���д�ڷ�����,�ᷢ��ֵ��û�н���
    }
    public static void swap(int a, int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;

    }
}
