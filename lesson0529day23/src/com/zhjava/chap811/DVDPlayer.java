package com.zhjava.chap811;

public class DVDPlayer extends  Media implements  MediaPlayer{
    @Override
    public void play() {
        System.out.println("²¥·ÅDVD.........");
    }

    @Override
    public void stop() {
        System.out.println("¹Ø±ÕDVD¡£¡£¡£¡£¡£¡£¡£");
    }

    @Override
    public void open() {

    }
    //DVD²¥·ÅÆ÷

}
