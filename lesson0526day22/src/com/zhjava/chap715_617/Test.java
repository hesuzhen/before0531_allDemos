package com.zhjava.chap715_617;

public class Test {
    public static void main(String[] args) {
        Team team = new Team();
        team.addMember("Ò×ìÈÇ§çô");
        Role r=new Magicer(5);

        team.addMember("ÎâÀÚ");
        Role r2=new Soldier(10);
        System.out.println("×ÜÉËº¦Öµ£º"+team.attackSum(r));
        System.out.println("×ÜÉËº¦Öµ£º"+team.attackSum(r2));

    }
}
