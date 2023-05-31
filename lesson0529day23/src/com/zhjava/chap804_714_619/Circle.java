package com.zhjava.chap804_714_619;

public  class Circle implements Shape{
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

    //求周长
    public double  calGirth(){

        return 2*Math.PI*r;
    }
    //求面积
    public double  calArea(){


        return Math.PI*r*r;
    }
}
