package com.zhjava.chap620;

public class Test {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[]{
                new Circle(4),
                new Rect(3,4),
                new Square(6)
        };
        //�ֱ��ӡ����������ܳ������
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].setGirth();
            shapes[i].setArea();
            System.out.println("�ܳ���"+shapes[i].getGirth());
            System.out.println("���"+shapes[i].getArea());
        }
    }
}
