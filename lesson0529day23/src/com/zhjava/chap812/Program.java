package com.zhjava.chap812;

class Program {
    //һ����Ŀ
    private Performer[] ps;
    public Program(){
        ps = new Performer[3];
        ps[0] = new Singer();
        ps[1] = new Dancer();
        ps[2] = new Player();
    }
    //����������У��������б��������Ŀ������ Performer �� perform ����
    public void show(){
        for (int i = 0; i < ps.length; i++) {
            ps[i].perform();
        }
    }
}