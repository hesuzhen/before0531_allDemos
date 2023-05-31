package com.zhjava.exercise03;

class Animal{
    // 1
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
//2
    public Dog(){}
    public Dog(String name){
        super.setName(name);
    }
}
class Cat extends Animal{
//3
    public Cat(){}
    public Cat(String name){
        super.setName(name);
    }
}
 class TestAnimal{

    public static void main(String args[]){
        Animal[] as = new Animal[]{
                new Dog("Pluto"),
                new Cat("Tom"),
                new Dog("Snoopy"),
                new Cat("Garfield")
        };
        Dog[] dogs= getAllDog(as);
        System.out.println("===============");
        for(int i = 0; i<dogs.length; i++){
            if(dogs[i]!=null){
                System.out.println(dogs[i].getName());
            }

        }
    }
    /*
        ���//4 ������ա�getAllDog ������һ��Animal ��������ѡ�����е�
        Dog ���󣬲�����Щ�������һ��Dog �����з��ء�
     */
    public static Dog[] getAllDog(Animal[] as){
//4
        boolean flag=false;//�ж��Ƿ����ɹ�
        Dog dogs1[]=new Dog[as.length];
        for (int i = 0; i < as.length; i++) {
            //�������е�Dog����
            //s:if(as[i] instanceof  Dog)
           if (as[i] instanceof Dog){
               dogs1[i]=(Dog)as[i];
               flag=true;


            }
        }
        if(flag){
            System.out.println("����ɹ�");
        }else{
            System.out.println("����ʧ�ܣ�");
        }
        System.out.println("=======================");
        System.out.println("ѭ������dogs1������");
        //���һ�£�ѭ������һ��dogs1���Dog���͵����飬�������Ƿ����ɹ�
        for (int i = 0; i < dogs1.length; i++) {
            System.out.println(dogs1[i]+" ");
        }

        return  dogs1;
    }
}