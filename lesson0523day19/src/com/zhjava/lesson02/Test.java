package com.zhjava.lesson02;

public class Test {
    //static �ؼ��ֵ�ʹ��

    /*
    1��static �����������ԡ���̬���ԡ�����������̬������������顾��̬����顿
    2��static ���δ����
    static {
        ��Ҫ���óɹ�������ݷ���������
    }
    3����̬��������ͨ�����ĵ���
        ��̬�������Ե��þ�̬���������ǲ��ܵ�����ͨ����
     ��  ��ͨ�������Ե��þ�̬����
    */

    public static void main(String[] args) {
        Student student1 = new Student("����ӱ", 30, "�й�");
        Student student2 = new Student("����ǧ��", 23, "�й�");
        Student student3= new Student("����", 25, "������");
        student1.show4();
        student2.show4();
        student3.show4();

    }
}
