package com.zhjava.lesson02;

public class Truck extends MotoVehicle{
    /*
    新购置了卡车，根据吨位，租金每吨每天50对系统进行扩展，计算汽车租赁的总租金
    * */
    //卡车类
    private int tonnage;//吨位

    public Truck() {
    }

    public Truck(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                '}';
    }

    @Override
    public int calcRent(int days) {
        int rentPrice=0;
        rentPrice=getTonnage()*50*days;
        return rentPrice;
    }
}
