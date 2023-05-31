package com.zhjava.lesson02;

public class Truck extends MotoVehicle{
    /*
    �¹����˿��������ݶ�λ�����ÿ��ÿ��50��ϵͳ������չ�������������޵������
    * */
    //������
    private int tonnage;//��λ

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
