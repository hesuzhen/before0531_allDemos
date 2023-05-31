package com.zhjava.lesson04;
class ArrayMax{
    public int arrayMax(int [] arr){
        int max=arr[0];//假设最大值为第一个
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return  max;
    }
}


public class Test {
    public static void main(String[] args) {
        ArrayMax arrayMax = new ArrayMax();
        int array1[]={34,23,12,54,65};
        System.out.println("数组中最大值："+arrayMax.arrayMax(array1));

    }
}
