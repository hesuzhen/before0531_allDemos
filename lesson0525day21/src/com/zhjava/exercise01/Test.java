package com.zhjava.exercise01;

public class Test {
    /*
        编程创建一个 Box类
        在其中定义三个变量表示一个立方体的长、宽和高，
        定义一个方法求立方体的体积。
        创建一个对象，求给定尺寸的立方体的体积。
     */
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.calVolume(2,4,6));

    }
}
