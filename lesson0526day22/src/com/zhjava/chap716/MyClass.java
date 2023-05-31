package com.zhjava.chap716;

public class MyClass {
    private static  int count;//统计创建了多少个对象

    public MyClass() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MyClass.count = count;
    }

}
class Test{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(MyClass.getCount());
    }
}
