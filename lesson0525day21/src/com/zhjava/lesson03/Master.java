package com.zhjava.lesson03;

public class Master {
    //主人类

    //带狗狗去医院
    public void Hospital(Dog dog){
        //带狗狗去医院的判断标志： 狗狗的健康值
        if(dog.getHealth()<80){
            System.out.println("带狗狗去医院。。。。。");
            dog.goHospital();
        }else{
            System.out.println("狗狗很健康，不需要去医院");
        }
    }
    //主人带企鹅去医院
    public void Hospital(Penguin penguin){
        //判断要不要带企鹅去医院的标准
        if(penguin.getHealth()<90){
            System.out.println("企鹅生病了，带企鹅去医院。。。。。。。");
            penguin.goHospital();
        }else{
            System.out.println("企鹅宝宝很健康，不要去医院。。。。");
        }
    }
    /*
       写到这里发现每有一个宠物生病，都要去Master类中带他去医院
       而且方法的大部分内容都是一样的，只是参数不同
        为了提高代码段复用性和可扩展性，减少冗余
        因此就把具体的Dog、Penguin都看成是宠物，传参就传一个宠物 Pet 对象就好了

     */
    public void hospital(Pet pet){
        if(pet.getHealth()<80){
            System.out.println("宠物生病了，带宠物去医院。。。。。");
            pet.goHospital();
            //pet.goHospital();
                /*
                写到这里的时候发现Pet类里面没有goHospital方法，
                 缺啥补啥，那就去Pet类中写goHospital方法


             */
        }else{
            System.out.println("宠物很健康，不需要去医院。。。。");
        }
    }
    //主人带宠物玩耍
    public void play(Pet pet){
        //pet.playDog();
        /*想让父类的对象调用子类中特有的方法的时候
        用 instanceof 关键字判断传进来的参数是不是同一个类型
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
