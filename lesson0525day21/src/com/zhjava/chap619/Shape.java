package com.zhjava.chap619;

public class Shape {
    private double area;
    private double girth;

    public Shape() {
    }

    public Shape(double area, double girth) {
        this.area = area;
        this.girth = girth;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGirth() {
        return girth;
    }

    public void setGirth(double girth) {
        this.girth = girth;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", girth=" + girth +
                '}';
    }
}
