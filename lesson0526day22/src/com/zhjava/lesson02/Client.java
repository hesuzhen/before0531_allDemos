package com.zhjava.lesson02;

public class Client {
    //�ͻ���

    //������ֳ��������
    public int calTotalRent(MotoVehicle[] m,int days){
        int totalRentPrice=0;//�����
        for (int i = 0; i < m.length; i++) {
            totalRentPrice+=m[i].calcRent(days);
        }
        return  totalRentPrice;
    }
    //3�������������޵������
    public int calTotal(MotoVehicle[] m,int days){
        int totalRentPrice=0;//�����
        for (int i = 0; i < m.length; i++) {
            totalRentPrice=m[i].calcRent(days);
        }
        return  totalRentPrice;
    }
    public int calAllPrices(MotoVehicle m,int days){
        int totalprices=0;//�����

        if(m instanceof Car){
            Car car=(Car) m;
            totalprices = car.calcRent(days);
        }else if(m instanceof  Bus){
            Bus bus=(Bus) m;
            totalprices = bus.calcRent(days);
        } else if (m instanceof  Truck) {
            Truck truck=(Truck) m;
            totalprices = truck.calcRent(days);
        }

        return  totalprices;
    }
}
