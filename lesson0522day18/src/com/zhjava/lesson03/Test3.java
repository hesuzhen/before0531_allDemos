package com.zhjava.lesson03;

public class Test3 {
    //����һ��������4��
    public static void main(String[] args) {
        Student student = new Student();
        student.name="����";
        student.age=15;
        student.tel=6666666;
        student.id=122;
        student.address="����·11��";
        Student student2 = new Student();
        student2.name="����";
        student2.age=16;
        student2.tel=111111;
        student2.id=111;
        student2.address="����·11��";
        Username username = new Username();
        username.addStuInfo(student);
        username.addStuInfo(student2);
        username.showStuInfo(student);
        username.showStuInfo(student2);
    }
    //ͬʱ���Ӷ��

}
