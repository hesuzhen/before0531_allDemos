package com.zhjava.chap811;

public class TapePlayer extends  Media implements  MediaPlayer{
    @Override
    public void play() {
        System.out.println("����Tape........");
    }

    @Override
    public void stop() {
        System.out.println("�ر�tape........");
    }

    @Override
    public void open() {

    }
    //¼�������ŴŴ�
}
