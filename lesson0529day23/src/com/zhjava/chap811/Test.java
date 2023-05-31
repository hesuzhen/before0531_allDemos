package com.zhjava.chap811;

public class Test {
    public static void main(String[] args) {
        Controller c = new Controller();
        MediaPlayer[] players = c.getPlayers();

       /* Media media1 = new CDPlayer();
        media1.setName("CD");
        Media media2 = new DVDPlayer();
        media2.setName("DVD");
        Media media3 = new TapePlayer();
        media3.setName("Tape");*/
        ((Media)players[0]).setName("CD");
        ((Media)players[1]).setName("DVD");
        ((Media)players[2]).setName("Type");
        for (int i = 0; i < players.length; i++) {

            c.open(i);
            c.play(i);
            c.stop(i);
        }


    }
}
