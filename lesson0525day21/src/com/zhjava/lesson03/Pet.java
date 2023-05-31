package com.zhjava.lesson03;

public abstract class Pet {
    //宠物类
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
    /*写去医院的方法的时候，由于每个宠物需要治疗的方式不一样，所以这里的方法体不好写
    那就不要这个方法体 把这个方法变成抽象的
    那这个类也必须要变成抽象的

     */
    public abstract void goHospital();
}
