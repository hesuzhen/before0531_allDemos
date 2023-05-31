package com.zhjava.lesson02;

public class Pet {
    //≥ËŒÔ¿‡
    private String name;
    private int age;
    private String color;
    private String health;
    String hobby;

    public Pet() {
    }
    public Pet(String name) {
        this.name=name;
    }
    public Pet(String name, int age, String color, String health) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
    public void show(){
        System.out.println(name+","+age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", health='" + health + '\'' +
                '}';
    }
}
