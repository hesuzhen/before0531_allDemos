package com.zhjava.lesson04;

public class CommonHandset extends  Handset implements PlayWiring{
    public CommonHandset(){

    }

    @Override
    public void sendInfo() {
        System.out.println("发送文字信息。。。");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话。。。。");
    }

    @Override
    public void info() {

    }

    @Override
    public void play(String content) {
        System.out.println("这是一款型号为G502c的索尼爱立信手机");
        System.out.println("开始播放音乐《"+content+"》。。。。。");
    }
    //普通手机
}
