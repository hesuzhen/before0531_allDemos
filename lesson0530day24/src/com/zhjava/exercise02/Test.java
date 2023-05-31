package com.zhjava.exercise02;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(102);
            System.out.println(student.getAge());
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
class Student{
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age>1 && age<100){

            this.age = age;
        }else{
            //System.out.println("年龄必须在1-100之间");
            throw  new Exception("年龄必须在1-100之间");
        }

    }
}
