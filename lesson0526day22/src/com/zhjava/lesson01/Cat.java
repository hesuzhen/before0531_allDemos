package com.zhjava.lesson01;

public class Cat extends Pet{
    //����è

    //��è��ιʳ
    public void feedCat(){
        System.out.println("��è��ιʳ����������");
        setHealth(getHealth()+4);
    }
    //����è��
    public void getCat(){
        System.out.println("è�䱻�����ˡ�����");
    }
}
