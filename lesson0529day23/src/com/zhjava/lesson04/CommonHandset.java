package com.zhjava.lesson04;

public class CommonHandset extends  Handset implements PlayWiring{
    public CommonHandset(){

    }

    @Override
    public void sendInfo() {
        System.out.println("����������Ϣ������");
    }

    @Override
    public void call() {
        System.out.println("��ʼ����ͨ����������");
    }

    @Override
    public void info() {

    }

    @Override
    public void play(String content) {
        System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ�");
        System.out.println("��ʼ�������֡�"+content+"������������");
    }
    //��ͨ�ֻ�
}
