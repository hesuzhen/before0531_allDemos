package com.zhjava.lesson03;

public abstract class Pet {
    //������
    private String name;
    private int health;
    private int age;

    public Pet() {
    }

    public Pet(String name, int health, int age) {
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", age=" + age +
                '}';
    }
    /*дȥҽԺ�ķ�����ʱ������ÿ��������Ҫ���Ƶķ�ʽ��һ������������ķ����岻��д
    �ǾͲ�Ҫ��������� �����������ɳ����
    �������Ҳ����Ҫ��ɳ����

     */
    public abstract void goHospital();
}
