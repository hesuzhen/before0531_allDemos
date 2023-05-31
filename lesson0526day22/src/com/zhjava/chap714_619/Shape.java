package com.zhjava.chap714_619;

public abstract class Shape {
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

    public abstract double setArea();

    public double getGirth() {
        return girth;
    }

    public abstract double setGirth();

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", girth=" + girth +
                '}';
    }
}
