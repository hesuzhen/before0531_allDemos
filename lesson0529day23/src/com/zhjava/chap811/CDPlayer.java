package com.zhjava.chap811;

public class CDPlayer extends  Media implements MediaPlayer {
    public CDPlayer() {
        //super.getName();
    }

    public CDPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("����CD....");
    }

    @Override
    public void stop() {
        System.out.println("�ر�CD.......");
    }

    @Override
    public void open() {
        System.out.println("��CD.......");
    }
    //CD ������
}
