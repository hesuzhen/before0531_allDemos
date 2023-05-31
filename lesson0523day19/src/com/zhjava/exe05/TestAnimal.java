package com.zhjava.exe05;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class TestAnimal{
    public static void main(String args[]){
//主方法代码省略
    }
    public static Animal getAnimal(){
//1
        //return null;  可以
        //return new Animal();  可以
        //return new Dog();
        return new Cat();   //可以
    }
}
