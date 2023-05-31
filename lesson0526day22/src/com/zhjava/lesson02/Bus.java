package com.zhjava.lesson02;

public final class Bus  extends  MotoVehicle{
    private int seatCount;//座椅数量

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
    //bus租金
    @Override
    public int calcRent(int days) {
        int rentPrice=0;
        if(getSeatCount()<=16){
            //800一天
          rentPrice=800*days;

        }else if(getSeatCount()>16){
            //1500一天
            rentPrice=1500*days;
        }
        return rentPrice;
    }
}
