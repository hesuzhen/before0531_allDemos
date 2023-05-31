package com.zhjava.lesson01;

import java.util.Scanner;

public class Master {
    //������

    //ι������
    public void feedPet(Pet pet){
        //�����Cat��
        if(pet instanceof  Cat){
            //����ת��
            Cat cat=(Cat) pet;
            cat.feedCat();
        }
    }
    //��������
    public Pet getPet(String typeId){
        switch(typeId){
            case "1":
                System.out.println("����è��");
                Cat cat = new Cat();
                cat.getCat();
                break;
            case "2":
                System.out.println("��������");
                Dog dog = new Dog();
                dog.getDog();
                break;
            case "3":
                System.out.println("�������");
                Penguin penguin = new Penguin();
                penguin.getPenguin();
                break;
            default:
                System.out.println("��Ǹ��û�и��������");
                break;
        }
        return new Pet();//���ǲ�֪�����ﷵ��ֵ���͸�ɸ������ͼ��ʲô��
    }

    //�ͳ�������Ϸ
    public void playPet(Pet pet){
        if(pet instanceof  Dog){
            Dog dog=(Dog)pet;
            dog.playDog();
        } else if (pet instanceof  Penguin) {
            Penguin penguin=(Penguin) pet;
            penguin.playPenguin();
        }
    }
}
