package com.zhjava.lesson04;

public class TestThrow {
    //异常的抓取
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
        if(sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else{
            //如果不是，就给出提示
            try{
                //throw  new Exception("性别超出范围");
                throw new MyException("哎呀，没有这个性别呢~");
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
