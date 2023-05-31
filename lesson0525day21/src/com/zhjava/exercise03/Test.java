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
        完成//4 处的填空。getAllDog 方法从一个Animal 数组中挑选出所有的
        Dog 对象，并把这些对象放在一个Dog 数组中返回。
     */
    public static Dog[] getAllDog(Animal[] as){
//4
        boolean flag=false;//判断是否存入成功
        Dog dogs1[]=new Dog[as.length];
        for (int i = 0; i < as.length; i++) {
            //挑出所有的Dog对象
            //s:if(as[i] instanceof  Dog)
           if (as[i] instanceof Dog){
               dogs1[i]=(Dog)as[i];
               flag=true;


            }
        }
        if(flag){
            System.out.println("存入成功");
        }else{
            System.out.println("存入失败！");
        }
        System.out.println("=======================");
        System.out.println("循环遍历dogs1的内容");
        //检测一下，循环遍历一下dogs1这个Dog类型的数组，看数据是否存入成功
        for (int i = 0; i < dogs1.length; i++) {
            System.out.println(dogs1[i]+" ");
        }

        return  dogs1;
    }
}