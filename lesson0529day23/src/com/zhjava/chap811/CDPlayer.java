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
        System.out.println("播放CD....");
    }

    @Override
    public void stop() {
        System.out.println("关闭CD.......");
    }

    @Override
    public void open() {
        System.out.println("打开CD.......");
    }
    //CD 播放器
}
