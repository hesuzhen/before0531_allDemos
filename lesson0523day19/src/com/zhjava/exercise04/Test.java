package com.zhjava.exercise04;

public class Test {
    public static void main(String[] args) {
        Address addr = new Address("�����к������廪԰1 ��", "100084");
        Worker worker=new Worker("����",25,2500,addr);
        System.out.println(worker.show());
        addr.show();
    }
}
