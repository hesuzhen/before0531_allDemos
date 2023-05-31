package com.zhjava.lesson;

public class TestData {
    public static void main(String[] args) {
        Data data = new Data();
        data.a=30;
        data.b=40;
        System.out.println("交换前：a="+ data.a+",b="+data.b);
//        int temp=0;
//        temp=data.a;
//        data.a=data.b;
//        data.b=temp;
        swap(data);
        System.out.println("交换后：a="+data.a+",b="+data.b);
    }
    public static void swap(Data data){
        int temp=0;
        temp=data.a;
        data.a=data.b;
        data.b=temp;

    }
}
