package com.zhjava.lesson03;

public class Test {
    //访问修饰符
    public static void main(String[] args) {
        Dog dog=new Dog("哈基米","呆子");
        System.out.println(dog.toString());
        //dog.hobby; 这里跨包了，hobby是缺省状态下的属性，所以不能调用
    }
}
