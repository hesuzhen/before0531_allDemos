package com.zhjava.chap810;

abstract class Animal{
    public abstract void eat();
}
interface Pet{
    void play();
}
class Dog extends Animal implements Pet{
    public void eat(){
        System.out.println("Dog eat Bones");
    }
    public void play(){
        System.out.println("Play with Dog");
    }
}
class Cat extends Animal implements Pet{
    public void eat(){
        System.out.println("Cat eat fish");
    }
    public void play(){
        System.out.println("Play with Cat");
    }
}
class Wolf extends Animal{
    public void eat(){
        System.out.println("Wolf eat meat");
    }
}
public class TestMain{
    public static void main(String args[]){
        Animal as[] = new Animal[3];
        as[0] = new Dog();
        as[1] = new Cat();
        as[2] = new Wolf();
    //���� as ���������ж���� eat ����
    //1
        for (int i = 0; i < as.length; i++) {
            as[i].eat();
        }
    //���� as ���������г���� play ����
    //2
        for (int i = 0; i <as.length ; i++) {
            if(as[i] instanceof Pet){
                ((Pet) as[i]).play();
            }
        }
    }
}

