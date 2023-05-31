package com.zhjava.lesson02;

public class Test {
    //static 关键字的使用

    /*
    1、static 可以修饰属性【静态属性】、方法【静态方法】、代码块【静态代码块】
    2、static 修饰代码块
    static {
        把要设置成共享的内容放置在这里
    }
    3、静态方法和普通方法的调用
        静态方法可以调用静态方法，但是不能调用普通方法
     ·  普通方法可以调用静态方法
    */

    public static void main(String[] args) {
        Student student1 = new Student("赵丽颖", 30, "中国");
        Student student2 = new Student("易烊千玺", 23, "中国");
        Student student3= new Student("吴磊", 25, "美国国");
        student1.show4();
        student2.show4();
        student3.show4();

    }
}
