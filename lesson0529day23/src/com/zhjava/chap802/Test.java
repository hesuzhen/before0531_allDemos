package com.zhjava.chap802;

interface IA{
    void m1();
    void m2();
}
abstract  class MyClassA implements IA{
    public void m1(){}

}
class MyClassB extends MyClassA{

    @Override
    public void m2() {

    }
}
