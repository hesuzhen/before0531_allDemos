package com.zhjava.lesson02;

public class Dog extends  Pet{
    //¹·¹·Àà

    private  String strain;//Æ·ÖÖ

    public Dog() {
    }
   // public Pet(){}

    public Dog(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
}
