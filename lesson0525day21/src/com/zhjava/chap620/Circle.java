package com.zhjava.chap620;

public class Circle extends Shape {
    private int r;

    public Circle() {
    }

    @Override
    public double setArea() {
       return Math.PI*r*r;
    }

    @Override
    public double setGirth() {
        return 2*Math.PI*r;
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

}
