package com.zhjava.lesson03;

public class FDdoor  implements Door,Lock{

    @Override
    public void openDoor() {
        System.out.println("门开了。。。");
    }

    @Override
    public void closeDoor() {
        System.out.println("门关了。。。。");
    }

    @Override
    public void openLock() {
        System.out.println("上锁。。。。");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁。。。。。");
    }
    //拍照
    public void takePhoto(){
        System.out.println("开始拍照。。。。。。");
    }
    //监控
    public void monitor(){
        System.out.println("开始监控。。。。");
    }
}
