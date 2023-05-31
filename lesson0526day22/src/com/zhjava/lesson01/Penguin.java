package com.zhjava.lesson01;

public class Penguin extends Pet{
    //企鹅类
    private String sex;

    public Penguin() {
    }

    public Penguin(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                '}';
    }
    //给企鹅喂食
    public void feedPenguin(){
        System.out.println("给企鹅喂食。。。。。");
        setHealth(getHealth()+3);
    }
    //领养企鹅
    public void getPenguin(){
        System.out.println("企鹅被领养了。。。");
    }
    //和企鹅玩游戏
    public void playPenguin(){
        System.out.println("和企鹅玩游泳游戏。。。。");
        setHealth(getHealth()-10);
        setLove(getLove()+5);
    }
}
