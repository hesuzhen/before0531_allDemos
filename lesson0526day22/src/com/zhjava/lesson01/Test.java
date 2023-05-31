package com.zhjava.lesson01;

import java.util.Scanner;

public class Test {
    /*
    * 需求说明
        使用多态实现喂养宠物功能
        增加宠物猫并喂食，其健康值增加4

        使用父类作为方法返回值
        实现思路
        在Master类添加领养方法getPet(String typeId?)
        创建测试类，根据主人选择宠物类型编号来领养宠物

        主人根据宠物编号领养宠物
        主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5
        主人和企鹅玩游泳游戏，企鹅健康值减少10，与主人亲密度增加5

    * */
    public static void main(String[] args) {

       /* Master m = new Master();
        Pet pet=new Cat();
        m.feedPet(pet);
        System.out.println(pet.getHealth());*/
        /*m.feedPet(pet);
        System.out.println(pet.getHealth());*/

        //领养宠物
        Master m1 = new Master();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入宠物类型编号：\n1、猫猫\n2、狗狗\n3、企鹅\n");
        String choose = sc.next();
        m1.getPet(choose);

        //和宠物玩游戏
        Master m2=new Master();
        Pet pet=new Dog();
        Pet pet1=new Penguin();
        pet.setHealth(60);
        m2.playPet(pet);
        System.out.println("狗狗健康值："+pet.getHealth());
        System.out.println("狗狗亲密度："+pet.getLove());

        pet1.setHealth(80);
        pet1.setLove(10);
        m2.playPet(pet1);
        System.out.println("企鹅健康值："+pet1.getHealth());
        System.out.println("企鹅亲密度："+pet1.getLove());

    }
}
