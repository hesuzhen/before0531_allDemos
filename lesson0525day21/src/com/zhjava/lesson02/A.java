package com.zhjava.lesson02;

    /*抽象类：
        1、抽象类用来干嘛的？
            制定一种规定和约束，子类必须重写的；这里可以结合案例，开连锁火锅店，总店给的配料分店开店的时候必须执行
        2、特点
            抽象类中有抽象方法也可以有普通方法
            抽象类中不一定有抽象方法
            不能被创建对象（原因：就算能创建对象了，里面大部分都是抽象方法，没有方法体，执行什么啊，本身就是一种规定）
     抽象方法：
            1、抽象方法是什么？
                子类必须要执行的方法，用关键字abstract修饰
            2、特点
                没有方法体
                必须在抽象类中
     子类重写父类的抽象方法：
            1、如果没有全部重写，那么该类必须变成抽象类，剩下的没重写的方法再由该类的子类重写
            2、子类如果全部重写了父类的抽象方法，那么就算全部完成作业了，那就不用变成抽象类
     */
public abstract class A {
    //制定规定的抽象类
    public abstract void add();
    public abstract void minus();
    public abstract void chen();
    public abstract void chu();
}
//类B并没有全部重写父类A的方法，所以要把自己变成抽象类
//父类A中剩余的抽象方法再由B类的子类去重写
abstract  class B extends  A{
    @Override
    public void add() {

    }

}
//类C重写了类B没有重写的方法，到这里抽象类A里面布置的所有作业就全被做完了
class C extends  B{
    @Override
    public void minus() {

    }

    @Override
    public void chen() {

    }

    @Override
    public void chu() {

    }
}
//抽象类中不一定有抽象方法
abstract class D{
    public void show(){}
}
