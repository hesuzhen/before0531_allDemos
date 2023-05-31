package com.zhjava.random01;

public class Test5 {
    //冒泡排序
    public static void main(String[] args) {
        int [] array1=new int[]{89,98,77,12,21};
        //外循环：比较的轮数
        for (int i = 0; i <array1.length-1; i++) {
            //内循环：每轮比较的次数
            for (int j = 0; j <array1.length-i-1; j++) {
                if(array1[j]>array1[j+1]){
                    int temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;

                }
            }
        }
        for (int i = 0; i < array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
    }
}
