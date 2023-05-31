package com.zhjava.lesson01;

interface MyInterface{
    /*
        接口：
            不能被创建对象
            接口是一种规定、约束
        1、方法
                默认有个public abstract修饰
                接口里面的方法必须被实现，如果没有被子类实现，那么该子类必须变成抽象类
                接口里面不可以有普通方法
        2、属性
            接口里面的属性都是静态常量
        3、接口和类的关系
            类是单继承，接口是多实现
            继承在前，实现在后，接口名之间用逗号隔开
    * */
    void show(int a);//1、默认有个public abstract修饰
    int cal();
    //public abstract  void show();
    int a=10;//a是静态常量   2、接口里面的属性都是静态常量
   // a=20;
    //  3、接口里面不可以有普通方法
    //public  int cal(){return 0;};
    //  4、接口是一种规定、约束
    //  5、接口里面的方法必须被实现，如果没有被子类实现，那么该子类必须变成抽象类
}
interface  MyInterface2{
    void show2();
    int calMax();
}
abstract class A implements MyInterface{


    @Override
    public void show(int a) {

    }
}
class B extends A{

    @Override
    public int cal() {
        return 0;
    }
}
class C extends A implements MyInterface,MyInterface2{

    @Override
    public int cal() {
        return 0;
    }

    @Override
    public void show2() {

    }

    @Override
    public int calMax() {
        return 0;
    }
}
public class TestInterface {
}
