package com.zhjava.lesson02;

public abstract class MotoVehicle {


    private String no;//���ƺ�
    private String brand;//Ʒ��
    private String color;//��ɫ
    private String mileage;//���
    public MotoVehicle() {
    }

    public MotoVehicle(String no, String brand, String color, String mileage) {
        this.no = no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String  no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "MotoVehicle{" +
                "no=" + no +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }

    public abstract int calcRent(int days);
}
