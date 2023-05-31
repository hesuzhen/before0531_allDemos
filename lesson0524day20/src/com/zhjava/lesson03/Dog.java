package com.zhjava.lesson03;

import com.zhjava.lesson03.Pet;

public class Dog extends Pet {
    //狗狗类

    private  String strain;//品种


    public Dog() {
       // super();  不管我写没写，这里默认有一个super();
        //不写上super();就是隐式调用父类的无参构造
        System.out.println("我是子类的无参构造方法。。。。。");
    }

    public Dog(String strain,String name) {

       super(name);//显式调用父类的有参构造，这时候就会按照我们的需求去调用父类的有参构造
        super.setAge(10);//调用父类的属性

        this.strain = strain;
        System.out.println("我是子类的有参构造方法。。。。。");
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    //重写
    @Override
    public String toString() {
        super.show();//调用父类的方法
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
    //方法的重写
    public Dog show2(){

        return new Dog();
    }


}
