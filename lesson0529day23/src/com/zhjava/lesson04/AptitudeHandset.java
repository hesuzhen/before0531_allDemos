package com.zhjava.lesson04;

public class AptitudeHandset extends Handset implements TheakePictures,Network,PlayWiring{
    public AptitudeHandset(){

    }
    @Override
    public void networkConn() {
        System.out.println("����һ���ͺ�ΪHTC��I9100�ֻ���");
        System.out.println("�Ѿ������ƶ����硣����");
    }

    @Override
    public void play(String content) {
        System.out.println("��ʼ������Ƶ��"+content+"������������");
    }

    @Override
    public void takePictures() {
        System.out.println("���꣬���ճɹ�����������");
    }

    @Override
    public void sendInfo() {
        System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ����������");
    }

    @Override
    public void call() {
        System.out.println("��ʼ��Ƶͨ����������");
    }

    @Override
    public void info() {

    }
    //�����ֻ�
}
