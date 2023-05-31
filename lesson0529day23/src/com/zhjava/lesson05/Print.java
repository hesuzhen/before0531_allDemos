package com.zhjava.lesson05;

public class Print {
    //打印机
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
        System.out.println("使用"+box.getColor()+"墨盒打印了"+paper.getSize()+"纸张。。。");
    }
}
