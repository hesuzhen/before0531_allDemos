package com.zhjava.exercise05;

class Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    public Student() {
    }

    public Student(String name, int age, String address, String zipCode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
    //要求返回Student 对象的地址和邮编
    public String  getPostAddress(Student stu){

       return stu.getZipCode()+ stu.getAddress();
    }
}