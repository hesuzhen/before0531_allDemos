package com.zhjava.exe05;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class TestAnimal{
    public static void main(String args[]){
//����������ʡ��
    }
    public static Animal getAnimal(){
//1
        //return null;  ����
        //return new Animal();  ����
        //return new Dog();
        return new Cat();   //����
    }
}
