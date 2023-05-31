package com.zhjava.lesson03;

public class Penguin extends  Pet{
    //企鹅类
    private String color;

    public Penguin() {
    }

    public Penguin(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "color='" + color + '\'' +
                '}';
    }
    //企鹅生病   去医院治疗方法
    public void goHospital(){
        System.out.println("企鹅生病吃药喝水。。。。。。。");
        //吃药喝水之后恢复健康值
        setHealth(getHealth()+3);
    }
    public void playPenguin(){
        System.out.println("企鹅在溜冰。。。。。");
    }
}
