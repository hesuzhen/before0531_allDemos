package com.zhjava.exe04;


class Super{
    public void m(){
        System.out.println("m() in Super");
    }
}
class Sub extends Super{
    public void m(){
        System.out.println("m() in Sub");
    }
}
public class TestSuperSub{
    public static void foo(Super s){
        s.m();
    }
    public static void main(String args[]){
        Sub sub = new Sub();
        Super sup = new Super();
        foo(sup);
        foo(sub);
    }
}
