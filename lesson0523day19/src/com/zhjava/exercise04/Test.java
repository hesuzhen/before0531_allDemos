package com.zhjava.exercise04;

public class Test {
    public static void main(String[] args) {
        Address addr = new Address("北京市海淀区清华园1 号", "100084");
        Worker worker=new Worker("张三",25,2500,addr);
        System.out.println(worker.show());
        addr.show();
    }
}
