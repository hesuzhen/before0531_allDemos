package com.zhjava.lesson03;

public class Penguin extends  Pet{
    //�����
    private String color;

    public Penguin() {
    }

    public Penguin(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "color='" + color + '\'' +
                '}';
    }
    //�������   ȥҽԺ���Ʒ���
    public void goHospital(){
        System.out.println("���������ҩ��ˮ��������������");
        //��ҩ��ˮ֮��ָ�����ֵ
        setHealth(getHealth()+3);
    }
    public void playPenguin(){
        System.out.println("������������������");
    }
}
