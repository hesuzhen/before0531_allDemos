package com.zhjava.lesson05;

public class Print {
    //��ӡ��
    private Box box;
    private Paper paper;

    public Print() {
    }

    public Print(Box box, Paper paper) {
        this.box = box;
        this.paper = paper;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
    public void show(){
        System.out.println("ʹ��"+box.getColor()+"ī�д�ӡ��"+paper.getSize()+"ֽ�š�����");
    }
}
