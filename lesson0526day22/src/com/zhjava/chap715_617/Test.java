package com.zhjava.chap715_617;

public class Test {
    public static void main(String[] args) {
        Team team = new Team();
        team.addMember("����ǧ��");
        Role r=new Magicer(5);

        team.addMember("����");
        Role r2=new Soldier(10);
        System.out.println("���˺�ֵ��"+team.attackSum(r));
        System.out.println("���˺�ֵ��"+team.attackSum(r2));

    }
}
