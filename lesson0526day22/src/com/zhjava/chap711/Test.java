package com.zhjava.chap711;

abstract class MyAbstractClass{
    public abstract void m1(); //1
    abstract protected void m2(); //2
    public static   final   void m(){};
}
class MySubClass extends MyAbstractClass{
    public void m1(){} //3
    protected void m2(){} //4
}
class Test{
    public static void main(String[] args) {
        MyAbstractClass myAbstractClass;
    }
}
