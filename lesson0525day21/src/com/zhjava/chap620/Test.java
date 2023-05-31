package com.zhjava.chap620;

public class Test {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[]{
                new Circle(4),
                new Rect(3,4),
                new Square(6)
        };
        //分别打印三个对象的周长和面积
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].setGirth();
            shapes[i].setArea();
            System.out.println("周长："+shapes[i].getGirth());
            System.out.println("面积"+shapes[i].getArea());
        }
    }
}
