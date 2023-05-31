package com.zhjava.exe03;

class Super{
    public void method(){
        System.out.println("method() in Super");
    }
    public void method(int i){
        System.out.println("method(int) in Super");
    }
}
class Sub extends Super{
    public void method(){
        System.out.println("method() in Sub");
    }
    public void method(String str){
        System.out.println("method(String) in Sub");
    }
}
public class TestSuperSub{
    public static void main(String args[]){
        Super s = new Sub();
        s.method(10);
        s.method();
       // s.method("hello");   ��Ϊmethod����������û����д�����ܵ�������ģ�ֻ�ܵ����Լ���
        s.method(20);
    }
}
