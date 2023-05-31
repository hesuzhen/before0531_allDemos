package com.zhjava.lesson01;

public class Cat extends Pet{
    //宠物猫

    //给猫咪喂食
    public void feedCat(){
        System.out.println("给猫咪喂食。。。。。");
        setHealth(getHealth()+4);
    }
    //领养猫咪
    public void getCat(){
        System.out.println("猫咪被领养了。。。");
    }
}
