package com.zhjava.lesson03;

public class Test3 {
    //现在一次性增加4个
    public static void main(String[] args) {
        Student student = new Student();
        student.name="张三";
        student.age=15;
        student.tel=6666666;
        student.id=122;
        student.address="中央路11号";
        Student student2 = new Student();
        student2.name="李四";
        student2.age=16;
        student2.tel=111111;
        student2.id=111;
        student2.address="中央路11号";
        Username username = new Username();
        username.addStuInfo(student);
        username.addStuInfo(student2);
        username.showStuInfo(student);
        username.showStuInfo(student2);
    }
    //同时增加多个

}
