package com.zhjava.lesson03;

import com.zhjava.lesson03.Pet;

public class Dog extends Pet {
    //������

    private  String strain;//Ʒ��


    public Dog() {
       // super();  ������дûд������Ĭ����һ��super();
        //��д��super();������ʽ���ø�����޲ι���
        System.out.println("����������޲ι��췽������������");
    }

    public Dog(String strain,String name) {

       super(name);//��ʽ���ø�����вι��죬��ʱ��ͻᰴ�����ǵ�����ȥ���ø�����вι���
        super.setAge(10);//���ø��������

        this.strain = strain;
        System.out.println("����������вι��췽������������");
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    //��д
    @Override
    public String toString() {
        super.show();//���ø���ķ���
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
    //��������д
    public Dog show2(){

        return new Dog();
    }


}
