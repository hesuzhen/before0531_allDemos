package com.zhjava.chap714_619;

public class Rect extends Shape{
    private int length;
    private int width;

    public Rect() {
    }

    @Override
    public double setArea() {
        return length*width;
    }

    @Override
    public double setGirth() {
        return (length+width)*2;
    }

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    //求周长
    public double  calGirth(){

        return (length+width)*2;
    }
    //求面积
    public double  calArea(){

        return length*width;
    }
}
