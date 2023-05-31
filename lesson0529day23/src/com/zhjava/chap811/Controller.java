package com.zhjava.chap811;

class Controller{
    //遥控类
    private MediaPlayer[] players;
    public Controller(){
        //构造函数中初始化 players 数组
        players=new MediaPlayer[]{
                new CDPlayer(),
                new DVDPlayer(),
                new TapePlayer()
        };
        //没给数组创建空间，不好存放值

       /* players[0]=new CDPlayer();
        players[1]=new DVDPlayer();
        players[2]=new TapePlayer();*/

    }

    public MediaPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(MediaPlayer[] players) {
        this.players = players;
    }

    //对相应的设备调用 play 方法
    public void play(int i){
        players[i].play();
    }
    public void stop(int i){
        //Media media = (Media) players[i];

        if(players[i] instanceof CDPlayer){
            CDPlayer cd=(CDPlayer) players[i];
            System.out.println("关闭"+cd.getName()+"遥控。。。。。");

        } else if (players[i] instanceof DVDPlayer) {

            DVDPlayer dvd=(DVDPlayer) players[i];
            System.out.println("关闭"+dvd.getName()+"遥控。。。。。");

        } else if (players[i] instanceof TapePlayer) {

            TapePlayer tape=(TapePlayer) players[i];
            System.out.println("关闭"+tape.getName()+"遥控。。。。。");

        }
    }
    public void open(int i){
        if(players[i] instanceof CDPlayer){
            CDPlayer cd=(CDPlayer) players[i];
            System.out.println("打开"+cd.getName()+"遥控。。。。。");

        } else if (players[i] instanceof DVDPlayer) {

            DVDPlayer dvd=(DVDPlayer) players[i];
            System.out.println("打开"+dvd.getName()+"遥控。。。。。");

        } else if (players[i] instanceof TapePlayer) {

            TapePlayer tape=(TapePlayer) players[i];
            System.out.println("打开"+tape.getName()+"遥控。。。。。");

        }



    }
}
