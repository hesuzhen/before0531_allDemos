package com.zhjava.chap811;

public class DVDPlayer extends  Media implements  MediaPlayer{
    @Override
    public void play() {
        System.out.println("����DVD.........");
    }

    @Override
    public void stop() {
        System.out.println("�ر�DVD��������������");
    }

    @Override
    public void open() {

    }
    //DVD������

}
