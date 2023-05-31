package com.zhjava.lesson;

public class Test {
    //数据的传递
    public static void main(String[] args) {
        //演示1
        int a=10;
        int b=20;
        System.out.println("交换前：a="+a+",b="+b);
//        int temp=0;
//        temp=a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println("交换后：a="+a+",b="+b);
        //像上面这样写交换数是没有任何问题的，但是我们要把交换数值的功能写在方法里,会发现值并没有交换
    }
    public static void swap(int a, int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;

    }
}
