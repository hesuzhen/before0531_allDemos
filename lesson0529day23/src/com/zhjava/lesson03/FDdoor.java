package com.zhjava.lesson03;

public class FDdoor  implements Door,Lock{

    @Override
    public void openDoor() {
        System.out.println("�ſ��ˡ�����");
    }

    @Override
    public void closeDoor() {
        System.out.println("�Ź��ˡ�������");
    }

    @Override
    public void openLock() {
        System.out.println("������������");
    }

    @Override
    public void closeLock() {
        System.out.println("��������������");
    }
    //����
    public void takePhoto(){
        System.out.println("��ʼ���ա�����������");
    }
    //���
    public void monitor(){
        System.out.println("��ʼ��ء�������");
    }
}
