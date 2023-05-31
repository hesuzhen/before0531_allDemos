package com.zhjava.lesson03;

public class Dog extends Pet{
    //狗狗类
    private String brain;

    public Dog() {
    }

    public Dog(String brain) {
        this.brain = brain;
    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "brain='" + brain + '\'' +
                '}';
    }
    //狗狗生病了  治疗方法
    public void goHospital(){
        System.out.println("狗狗生病吃饭睡觉疗养。。。。。。");
        //疗养之后 健康值+5
        setHealth(getHealth()+5);

    }
    public void playDog(){
        System.out.println("狗狗在公园里玩球。。。。。");
    }
}
