package com.zhjava.chap617;

public class Magicer extends Role{
    //��ʦ��
    private int level;//��Χ1-10

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
    //�÷������ط�ʦ�Ĺ����Ե�����ɵ��˺�ֵ��
    //��ʦ�����˺�ֵΪ��ħ���ȼ�*ħ�������˺�ֵ���̶�Ϊ5��
    public int attack(){
        return  level*5;
    }
}
