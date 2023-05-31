package com.zhjava.chap617;

public class Magicer extends Role{
    //法师类
    private int level;//范围1-10

    public Magicer() {
    }

    public Magicer(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Magicer{" +
                "level=" + level +
                '}';
    }
    //该方法返回法师的攻击对敌人造成的伤害值。
    //法师攻击伤害值为：魔法等级*魔法基本伤害值（固定为5）
    public int attack(){
        return  level*5;
    }
}
