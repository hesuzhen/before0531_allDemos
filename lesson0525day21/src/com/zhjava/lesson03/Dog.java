package com.zhjava.lesson03;

public class Dog extends Pet{
    //������
    private String brain;

    public Dog() {
    }

    public Dog(String brain) {
        this.brain = brain;
    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "brain='" + brain + '\'' +
                '}';
    }
    //����������  ���Ʒ���
    public void goHospital(){
        System.out.println("���������Է�˯������������������");
        //����֮�� ����ֵ+5
        setHealth(getHealth()+5);

    }
    public void playDog(){
        System.out.println("�����ڹ�԰�����򡣡�������");
    }
}
