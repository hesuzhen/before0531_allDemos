package com.zhjava.lesson01;

public class Dog extends  Pet{
    //������
   private String strain;

    public Dog() {
    }

    public Dog(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
    //������ιʳ
    public void feedDog(){
        System.out.println("������ιʳ����������");
        setHealth(getHealth()+6);
    }
    //��������
    public void getDog(){
        System.out.println("�����������ˡ�����");
    }
    //�͹�����ӷ�����Ϸ
    public void playDog(){
        System.out.println("�͹�����ӷ�����Ϸ��������");
        setHealth(getHealth()-10);
        setLove(getLove()+5);
    }
}
