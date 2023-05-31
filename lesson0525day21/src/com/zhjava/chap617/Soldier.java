package com.zhjava.chap617;

public class Soldier extends  Role{
    private int value;//¹¥»÷ÉËº¦Öµ

    public Soldier() {
    }

    public Soldier(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "value=" + value +
                '}';
    }
    public int attack(){
        return value;
    }
}
