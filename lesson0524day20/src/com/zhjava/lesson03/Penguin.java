package com.zhjava.lesson03;

import com.zhjava.lesson03.Pet;

public class Penguin extends Pet {
    //企鹅类

    private String love;

    public Penguin() {
        System.out.println("我是企鹅的无参构造。。。。。。。。。。");
    }

    public Penguin(String love) {
        this.love = love;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "love='" + love + '\'' +
                '}';
    }
    public Penguin method(){
        System.out.println("222222222222");
        return new Penguin();
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.method();

    }
}
