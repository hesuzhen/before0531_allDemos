package com.zhjava.exercise02;

public class Circle {
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
    //圆的周长
    public double zhou(int r){
        double zhou=Math.PI*r*2;
        return  zhou;
    }
    //圆的面积
    public double area(){
        double area=Math.PI*r*r;
        return area;
    }
}
