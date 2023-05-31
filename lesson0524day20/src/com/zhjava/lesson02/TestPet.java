package com.zhjava.lesson02;

public class TestPet {

    /*
        继承：
        1、为什么要有继承？
            把多个类相同的属性和方法进行优化，所以有了继承的概念
        2、继承的定义
            一个类不需要自己写属性和方法，要用的直接从另一个类中获取
        3、什么样子的可以用继承
            满足  A is a B的关系
        4、继承   关键字
            extends
        5、不是父类的所有的东西都能被子类继承
            1、private修饰的
            2、构造方法
            3、不同包下面缺省修饰的内容不可以访问
         6、继承的要求
            一个类同时只能继承一个父类
            所有类的子类共同的父类是object
    */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(10);
        int age = dog.getAge();
        dog.hobby="唱歌";



    }
}
