package com.zhjava.chap714_619;

public class Square extends  Rect{
    private int r;//�߳�

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
    //���ܳ�
    public double  calGirth(){

        return r*4;
    }
    //�����
    public double  calArea(){

        return r*r;
    }
}
