package com.zhjava.lesson01;

public class Penguin extends Pet{
    //�����
    private String sex;

    public Penguin() {
    }

    public Penguin(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                '}';
    }
    //�����ιʳ
    public void feedPenguin(){
        System.out.println("�����ιʳ����������");
        setHealth(getHealth()+3);
    }
    //�������
    public void getPenguin(){
        System.out.println("��챻�����ˡ�����");
    }
    //���������Ϸ
    public void playPenguin(){
        System.out.println("���������Ӿ��Ϸ��������");
        setHealth(getHealth()-10);
        setLove(getLove()+5);
    }
}
