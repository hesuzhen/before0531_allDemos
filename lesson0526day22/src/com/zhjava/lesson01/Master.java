package com.zhjava.lesson01;

import java.util.Scanner;

public class Master {
    //主人类

    //喂养宠物
    public void feedPet(Pet pet){
        //如果是Cat型
        if(pet instanceof  Cat){
            //向下转型
            Cat cat=(Cat) pet;
            cat.feedCat();
        }
    }
    //领养宠物
    public Pet getPet(String typeId){
        switch(typeId){
            case "1":
                System.out.println("领养猫咪");
                Cat cat = new Cat();
                cat.getCat();
                break;
            case "2":
                System.out.println("领养狗狗");
                Dog dog = new Dog();
                dog.getDog();
                break;
            case "3":
                System.out.println("领养企鹅");
                Penguin penguin = new Penguin();
                penguin.getPenguin();
                break;
            default:
                System.out.println("抱歉，没有该项宠物编号");
                break;
        }
        return new Pet();//就是不知道这里返回值类型搞成父类的意图是什么？
    }

    //和宠物玩游戏
    public void playPet(Pet pet){
        if(pet instanceof  Dog){
            Dog dog=(Dog)pet;
            dog.playDog();
        } else if (pet instanceof  Penguin) {
            Penguin penguin=(Penguin) pet;
            penguin.playPenguin();
        }
    }
}
