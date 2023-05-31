package com.zhjava.chap805;

interface IA{
    void ma();
}
interface IB{
    void mb();
}
class MySuper implements IA{
    public void ma(){}
}
class MySub extends MySuper implements IB{
    public void mb(){}
}
public class TestMain{
    public static void main(String args[]){
        MySuper ms = new MySub();
        System.out.println(ms instanceof IA);
        System.out.println(ms instanceof IB);
        System.out.println(ms instanceof MySuper);
        System.out.println(ms instanceof MySub);
    }
}
