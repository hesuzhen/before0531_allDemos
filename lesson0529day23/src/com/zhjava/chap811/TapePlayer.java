package com.zhjava.chap811;

public class TapePlayer extends  Media implements  MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放Tape........");
    }

    @Override
    public void stop() {
        System.out.println("关闭tape........");
    }

    @Override
    public void open() {

    }
    //录音机播放磁带
}
