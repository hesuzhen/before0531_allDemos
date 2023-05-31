package com.zhjava.chap714_619;

public class Square extends  Rect{
    private int r;//边长

    public Square() {
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
    //求周长
    public double  calGirth(){

        return r*4;
    }
    //求面积
    public double  calArea(){

        return r*r;
    }
}
