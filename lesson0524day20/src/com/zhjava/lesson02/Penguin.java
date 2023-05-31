package com.zhjava.lesson02;

public class Penguin {
    //∆Û∂Ï¿‡

    private String love;

    public Penguin() {
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
}
