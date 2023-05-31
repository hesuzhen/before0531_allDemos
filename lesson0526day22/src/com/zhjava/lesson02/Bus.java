package com.zhjava.lesson02;

public final class Bus  extends  MotoVehicle{
    private int seatCount;//��������

    public Bus() {
    }

    public Bus(int seatCount) {
        this.seatCount = seatCount;
    }
    public Bus(String no,int seatCount){
        super.setNo(no);
        this.seatCount=seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seatCount=" + seatCount +
                '}';
    }
    //bus���
    @Override
    public int calcRent(int days) {
        int rentPrice=0;
        if(getSeatCount()<=16){
            //800һ��
          rentPrice=800*days;

        }else if(getSeatCount()>16){
            //1500һ��
            rentPrice=1500*days;
        }
        return rentPrice;
    }
}
