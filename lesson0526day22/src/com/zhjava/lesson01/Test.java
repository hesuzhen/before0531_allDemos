package com.zhjava.lesson01;

import java.util.Scanner;

public class Test {
    /*
    * ����˵��
        ʹ�ö�̬ʵ��ι�����﹦��
        ���ӳ���è��ιʳ���佡��ֵ����4

        ʹ�ø�����Ϊ��������ֵ
        ʵ��˼·
        ��Master�������������getPet(String typeId?)
        ���������࣬��������ѡ��������ͱ������������

        ���˸��ݳ�������������
        ���˺͹�����ӷ�����Ϸ����������ֵ����10�����������ܶ�����5
        ���˺��������Ӿ��Ϸ����콡��ֵ����10�����������ܶ�����5

    * */
    public static void main(String[] args) {

       /* Master m = new Master();
        Pet pet=new Cat();
        m.feedPet(pet);
        System.out.println(pet.getHealth());*/
        /*m.feedPet(pet);
        System.out.println(pet.getHealth());*/

        //��������
        Master m1 = new Master();
        Scanner sc=new Scanner(System.in);
        System.out.print("������������ͱ�ţ�\n1��èè\n2������\n3�����\n");
        String choose = sc.next();
        m1.getPet(choose);

        //�ͳ�������Ϸ
        Master m2=new Master();
        Pet pet=new Dog();
        Pet pet1=new Penguin();
        pet.setHealth(60);
        m2.playPet(pet);
        System.out.println("��������ֵ��"+pet.getHealth());
        System.out.println("�������ܶȣ�"+pet.getLove());

        pet1.setHealth(80);
        pet1.setLove(10);
        m2.playPet(pet1);
        System.out.println("��콡��ֵ��"+pet1.getHealth());
        System.out.println("������ܶȣ�"+pet1.getLove());

    }
}
