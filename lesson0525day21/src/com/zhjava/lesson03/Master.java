package com.zhjava.lesson03;

public class Master {
    //������

    //������ȥҽԺ
    public void Hospital(Dog dog){
        //������ȥҽԺ���жϱ�־�� �����Ľ���ֵ
        if(dog.getHealth()<80){
            System.out.println("������ȥҽԺ����������");
            dog.goHospital();
        }else{
            System.out.println("�����ܽ���������ҪȥҽԺ");
        }
    }
    //���˴����ȥҽԺ
    public void Hospital(Penguin penguin){
        //�ж�Ҫ��Ҫ�����ȥҽԺ�ı�׼
        if(penguin.getHealth()<90){
            System.out.println("��������ˣ������ȥҽԺ��������������");
            penguin.goHospital();
        }else{
            System.out.println("��챦���ܽ�������ҪȥҽԺ��������");
        }
    }
    /*
       д�����﷢��ÿ��һ��������������ҪȥMaster���д���ȥҽԺ
       ���ҷ����Ĵ󲿷����ݶ���һ���ģ�ֻ�ǲ�����ͬ
        Ϊ����ߴ���θ����ԺͿ���չ�ԣ���������
        ��˾ͰѾ����Dog��Penguin�������ǳ�����ξʹ�һ������ Pet ����ͺ���

     */
    public void hospital(Pet pet){
        if(pet.getHealth()<80){
            System.out.println("���������ˣ�������ȥҽԺ����������");
            pet.goHospital();
            //pet.goHospital();
                /*
                д�������ʱ����Pet������û��goHospital������
                 ȱɶ��ɶ���Ǿ�ȥPet����дgoHospital����


             */
        }else{
            System.out.println("����ܽ���������ҪȥҽԺ��������");
        }
    }
    //���˴�������ˣ
    public void play(Pet pet){
        //pet.playDog();
        /*���ø���Ķ���������������еķ�����ʱ��
        �� instanceof �ؼ����жϴ������Ĳ����ǲ���ͬһ������
        */

        if(pet instanceof  Dog){
            Dog dog=(Dog) pet;
            dog.playDog();

        }else if(pet instanceof  Penguin){
            Penguin penguin=(Penguin) pet;
            penguin.playPenguin();
        }
    }
}
