package com.zhjava.lesson04;

public class Test {
    public static void main(String[] args) {


        PlayWiring pw1=new CommonHandset();
        Handset handset1=new CommonHandset();
        pw1.play("Wake");
        handset1.sendInfo();
        handset1.call();
        handset1.info();
        System.out.println();

        TheakePictures tp=new AptitudeHandset();
        Network network=new AptitudeHandset();
        PlayWiring pw=new AptitudeHandset();
        Handset handset=new AptitudeHandset();

        network.networkConn();
        pw.play("µ¾Ïã");
        tp.takePictures();
        handset.sendInfo();
        handset.call();
        //handset.info();




    }

}
