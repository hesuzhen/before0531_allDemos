package com.zhjava.chap812;

class Program {
    //一个节目
    private Performer[] ps;
    public Program(){
        ps = new Performer[3];
        ps[0] = new Singer();
        ps[1] = new Dancer();
        ps[2] = new Player();
    }
    //在这个方法中，调用所有表演这个节目的所有 Performer 的 perform 方法
    public void show(){
        for (int i = 0; i < ps.length; i++) {
            ps[i].perform();
        }
    }
}