package com.zhjava.lesson02;

    /*�����ࣺ
        1����������������ģ�
            �ƶ�һ�ֹ涨��Լ�������������д�ģ�������Խ�ϰ���������������꣬�ܵ�������Ϸֵ꿪���ʱ�����ִ��
        2���ص�
            ���������г��󷽷�Ҳ��������ͨ����
            �������в�һ���г��󷽷�
            ���ܱ���������ԭ�򣺾����ܴ��������ˣ�����󲿷ֶ��ǳ��󷽷���û�з����壬ִ��ʲô�����������һ�ֹ涨��
     ���󷽷���
            1�����󷽷���ʲô��
                �������Ҫִ�еķ������ùؼ���abstract����
            2���ص�
                û�з�����
                �����ڳ�������
     ������д����ĳ��󷽷���
            1�����û��ȫ����д����ô��������ɳ����࣬ʣ�µ�û��д�ķ������ɸ����������д
            2���������ȫ����д�˸���ĳ��󷽷�����ô����ȫ�������ҵ�ˣ��ǾͲ��ñ�ɳ�����
     */
public abstract class A {
    //�ƶ��涨�ĳ�����
    public abstract void add();
    public abstract void minus();
    public abstract void chen();
    public abstract void chu();
}
//��B��û��ȫ����д����A�ķ���������Ҫ���Լ���ɳ�����
//����A��ʣ��ĳ��󷽷�����B�������ȥ��д
abstract  class B extends  A{
    @Override
    public void add() {

    }

}
//��C��д����Bû����д�ķ����������������A���沼�õ�������ҵ��ȫ��������
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
//�������в�һ���г��󷽷�
abstract class D{
    public void show(){}
}
