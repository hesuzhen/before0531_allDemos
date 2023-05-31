package com.zhjava.chap714_619;

public class Test {
    public static void main(String[] args) {
       Shape shape= new Circle(10);
        System.out.println(shape.setArea());
        System.out.println(shape.setGirth());

        Shape shape1= new Rect(6,4);
        System.out.println(shape1.setArea());
        System.out.println(shape1.setGirth());



    }
}
