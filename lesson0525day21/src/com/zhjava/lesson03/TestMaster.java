package com.zhjava.lesson03;

    /*
        ��̬
     */
public class TestMaster {
        public static void main(String[] args) {
            //1������������
            /*
            Master m=new Master();
            Dog dog = new Dog();
            dog.setHealth(60);
            m.Hospital(dog);
            System.out.println("�������ڵĽ���ֵ"+dog.getHealth());*/
            //2������쿴��
            /*
            Master m=new Master();
            Penguin penguin=new Penguin();
            penguin.setHealth(92);
            m.Hospital(penguin);
            System.out.println(penguin.getHealth());
            */
            /*
                ��̬��
                 �﷨��
                    ����  ���������=new ���ࣨ��;
                 �ص㣺
                    ��߱��룬�ұ�ִ��

             */
            //3�������￴��
            Master m = new Master();
           // Pet pet=new Pet();
            // ȱPet�����ʱ�򣬷���Pet���Ѿ�����˳����࣬�������˶�����
            //��ô���ָ���������ĸ������������أ�
            //���Ծ������˶�̬�ĸ���
            Pet pet=new Dog();
            pet.setHealth(77);
            m.hospital(pet);
            System.out.println(pet.getHealth());

            Pet pet1=new Penguin();
            pet1.setHealth(68);
            m.hospital(pet1);
            System.out.println(pet1.getHealth());

            //���˴�������ˣ
            m.play(pet);
            m.play(pet1);

        }
}
