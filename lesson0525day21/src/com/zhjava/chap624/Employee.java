package com.zhjava.chap624;

public class Employee {
    //����Ա���ܵĸ���
    private String name;//����
    private int month;//Ա���������·�

    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getSalary(int month){
        //Ա�������գ���˾����⽱��100 Ԫ

        return 0;
    }
}
