package com.zhjava.lesson04;

public class TestThrow {
    //�쳣��ץȡ
    public static void main(String[] args) {
        Student student = new Student();
        student.setSex("12");
        System.out.println(student.getSex());
    }
}
class Student{
    private String sex;

    public Student() {
    }

    public Student(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("��")||sex.equals("Ů")){
            this.sex = sex;
        }else{
            //������ǣ��͸�����ʾ
            try{
                //throw  new Exception("�Ա𳬳���Χ");
                throw new MyException("��ѽ��û������Ա���~");
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

}
class  MyException extends  RuntimeException{
    public MyException(String content){
        super(content);
    }
}
