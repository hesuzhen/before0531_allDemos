package com.zhjava.chap811;

class Controller{
    //ң����
    private MediaPlayer[] players;
    public Controller(){
        //���캯���г�ʼ�� players ����
        players=new MediaPlayer[]{
                new CDPlayer(),
                new DVDPlayer(),
                new TapePlayer()
        };
        //û�����鴴���ռ䣬���ô��ֵ

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

    //����Ӧ���豸���� play ����
    public void play(int i){
        players[i].play();
    }
    public void stop(int i){
        //Media media = (Media) players[i];

        if(players[i] instanceof CDPlayer){
            CDPlayer cd=(CDPlayer) players[i];
            System.out.println("�ر�"+cd.getName()+"ң�ء���������");

        } else if (players[i] instanceof DVDPlayer) {

            DVDPlayer dvd=(DVDPlayer) players[i];
            System.out.println("�ر�"+dvd.getName()+"ң�ء���������");

        } else if (players[i] instanceof TapePlayer) {

            TapePlayer tape=(TapePlayer) players[i];
            System.out.println("�ر�"+tape.getName()+"ң�ء���������");

        }
    }
    public void open(int i){
        if(players[i] instanceof CDPlayer){
            CDPlayer cd=(CDPlayer) players[i];
            System.out.println("��"+cd.getName()+"ң�ء���������");

        } else if (players[i] instanceof DVDPlayer) {

            DVDPlayer dvd=(DVDPlayer) players[i];
            System.out.println("��"+dvd.getName()+"ң�ء���������");

        } else if (players[i] instanceof TapePlayer) {

            TapePlayer tape=(TapePlayer) players[i];
            System.out.println("��"+tape.getName()+"ң�ء���������");

        }



    }
}
