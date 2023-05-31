package com.zhjava.lesson03;

    /*
        多态
     */
public class TestMaster {
        public static void main(String[] args) {
            //1、带狗狗看病
            /*
            Master m=new Master();
            Dog dog = new Dog();
            dog.setHealth(60);
            m.Hospital(dog);
            System.out.println("狗狗现在的健康值"+dog.getHealth());*/
            //2、带企鹅看病
            /*
            Master m=new Master();
            Penguin penguin=new Penguin();
            penguin.setHealth(92);
            m.Hospital(penguin);
            System.out.println(penguin.getHealth());
            */
            /*
                多态：
                 语法：
                    父类  父类的引用=new 子类（）;
                 特点：
                    左边编译，右边执行

             */
            //3、带宠物看病
            Master m = new Master();
           // Pet pet=new Pet();
            // 缺Pet对象的时候，发现Pet类已经变成了抽象类，创建不了对象了
            //那么如何指明具体是哪个宠物生病了呢？
            //所以就引入了多态的概念
            Pet pet=new Dog();
            pet.setHealth(77);
            m.hospital(pet);
            System.out.println(pet.getHealth());

            Pet pet1=new Penguin();
            pet1.setHealth(68);
            m.hospital(pet1);
            System.out.println(pet1.getHealth());

            //主人带宠物玩耍
            m.play(pet);
            m.play(pet1);

        }
}
