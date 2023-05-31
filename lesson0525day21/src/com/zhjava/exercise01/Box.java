package com.zhjava.exercise01;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
        public String  calVolume(int length,int width,int height){
            String volume="体积："+length*width*height+"立方米";
            return volume;
        }
    }
