package com.zhjava.lesson02;

public class Fan implements  Usb{
    @Override
    public void service() {
        System.out.println("风扇转动了。。。。");
    }
    //风扇
}
