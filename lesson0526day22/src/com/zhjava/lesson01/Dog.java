package com.zhjava.lesson01;

public class Dog extends  Pet{
    //¹·¹·Àà
   private String strain;

    public Dog() {
    }

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
    //¸ø¹·¹·Î¹Ê³
    public void feedDog(){
        System.out.println("¸ø¹·¹·Î¹Ê³¡£¡£¡£¡£¡£");
        setHealth(getHealth()+6);
    }
    //ÁìÑø¹·¹·
    public void getDog(){
        System.out.println("¹·¹·±»ÁìÑøÁË¡£¡£¡£");
    }
    //ºÍ¹·¹·Íæ½Ó·ÉÅÌÓÎÏ·
    public void playDog(){
        System.out.println("ºÍ¹·¹·Íæ½Ó·ÉÅÌÓÎÏ·¡£¡£¡£¡£");
        setHealth(getHealth()-10);
        setLove(getLove()+5);
    }
}
