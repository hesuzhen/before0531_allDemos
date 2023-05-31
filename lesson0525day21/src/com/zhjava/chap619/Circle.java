package com.zhjava.chap619;

public class Circle extends Shape{
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    //求周长
    public double  calGirth(){

        return 2*Math.PI*r;
    }
    //求面积
    public double  calArea(){


        return Math.PI*r*r;
    }
}
