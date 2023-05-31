package com.zhjava.lesson04;

public class AptitudeHandset extends Handset implements TheakePictures,Network,PlayWiring{
    public AptitudeHandset(){

    }
    @Override
    public void networkConn() {
        System.out.println("这是一款型号为HTC的I9100手机：");
        System.out.println("已经启动移动网络。。。");
    }

    @Override
    public void play(String content) {
        System.out.println("开始播放视频《"+content+"》。。。。。");
    }

    @Override
    public void takePictures() {
        System.out.println("咔嚓，拍照成功。。。。。");
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带图片与文字的信息。。。。。");
    }

    @Override
    public void call() {
        System.out.println("开始视频通话。。。。");
    }

    @Override
    public void info() {

    }
    //智能手机
}
