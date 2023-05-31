package com.zhjava.lesson02;

public final class Car extends MotoVehicle{
    private String type;//型号

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }
    public Car(String no,String type){
       super.setNo(no);
        this.type=type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public int calcRent(int days) {
        int rentPrice=0;
        if("别克商务舱GL8".equals(getType())){
            rentPrice=600*days;
        }else if("宝马550i".equals(getType())){
            rentPrice=500*days;
        } else if ("别克林荫大道".equals(getType())) {
            rentPrice=300*days;
        }

        return rentPrice;
    }

}
