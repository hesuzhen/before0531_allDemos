package com.zhjava.lesson01;

interface MyInterface{
    /*
        �ӿڣ�
            ���ܱ���������
            �ӿ���һ�ֹ涨��Լ��
        1������
                Ĭ���и�public abstract����
                �ӿ�����ķ������뱻ʵ�֣����û�б�����ʵ�֣���ô����������ɳ�����
                �ӿ����治��������ͨ����
        2������
            �ӿ���������Զ��Ǿ�̬����
        3���ӿں���Ĺ�ϵ
            ���ǵ��̳У��ӿ��Ƕ�ʵ��
            �̳���ǰ��ʵ���ں󣬽ӿ���֮���ö��Ÿ���
    * */
    void show(int a);//1��Ĭ���и�public abstract����
    int cal();
    //public abstract  void show();
    int a=10;//a�Ǿ�̬����   2���ӿ���������Զ��Ǿ�̬����
   // a=20;
    //  3���ӿ����治��������ͨ����
    //public  int cal(){return 0;};
    //  4���ӿ���һ�ֹ涨��Լ��
    //  5���ӿ�����ķ������뱻ʵ�֣����û�б�����ʵ�֣���ô����������ɳ�����
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
