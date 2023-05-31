package com.zhjava.chap620;

public class Square extends Shape {
    private int r;//±ß³¤

    public Square() {
    }

    @Override
    public double setArea() {
        return r*r;
    }

    @Override
    public double setGirth() {
        return  r*4;
    }

    public Square(int r) {
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
        return "Square{" +
                "r=" + r +
                '}';
    }

}
