package com.zhjava.lesson02;

public class TestPet {

    /*
        �̳У�
        1��ΪʲôҪ�м̳У�
            �Ѷ������ͬ�����Ժͷ��������Ż����������˼̳еĸ���
        2���̳еĶ���
            һ���಻��Ҫ�Լ�д���Ժͷ�����Ҫ�õ�ֱ�Ӵ���һ�����л�ȡ
        3��ʲô���ӵĿ����ü̳�
            ����  A is a B�Ĺ�ϵ
        4���̳�   �ؼ���
            extends
        5�����Ǹ�������еĶ������ܱ�����̳�
            1��private���ε�
            2�����췽��
            3����ͬ������ȱʡ���ε����ݲ����Է���
         6���̳е�Ҫ��
            һ����ͬʱֻ�ܼ̳�һ������
            ����������๲ͬ�ĸ�����object
    */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(10);
        int age = dog.getAge();
        dog.hobby="����";



    }
}
