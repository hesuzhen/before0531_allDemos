package com.zhjava.chap803;

interface IA{
    void ma();
}
interface IB extends IA{
    void mb();
}
interface IC{
    void mc();
}
interface ID extends IB, IC{
    void md();
}
class ClassE implements ID{

    @Override
    public void ma() {

    }

    @Override
    public void mb() {

    }

    @Override
    public void mc() {

    }

    @Override
    public void md() {

    }
}
public class TestClassE{
    /*public static void main(String args[]){

        //调用 ma 方法
        IA ia=new ClassE();
        ia.ma();
        //调用 mb 方法
        IB ib=new ClassE();
        ib.mb();
        //调用 mc 方法
        IC ic = new ClassE();
        ic.mc();
        //调用 md 方法
        ID id = new ClassE();
        id.md();

    }*/

        public static void main(String args[]){
            IC ic = new ClassE();
            System.out.println(ic instanceof IA);
            System.out.println(ic instanceof IB);
            System.out.println(ic instanceof IC);
            System.out.println(ic instanceof ID);
            System.out.println(ic instanceof ClassE);
        }

}
