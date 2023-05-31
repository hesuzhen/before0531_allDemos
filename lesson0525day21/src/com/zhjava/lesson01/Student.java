package com.zhjava.lesson01;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*这里需要重写一下equals方法，因为在实际生活中，两个学生对象的属性值都是一样的
    按道理来说，应该返回true，可是在默认的equals方法中，返回的是false，所以需要重写一下
    之所以在这里重写，Object是所有类的父类
    */
    public boolean equals(Object obj) {
        //如果地址值是不一样的，那么返回false
        //this代表当前调用这个equals方法的对象，这里指的是s1
        //地址值一样的时候
        if(this==obj){
            return true;
        }
        //地址值不一样，但是所指向的属性值是一样的时候
        if(this!=obj){
            //1、判断是不是和Student是同一个类型，房子不一样，判断是不是同一个人
            if(obj instanceof  Student){
                //2、是同一个类型了，把obj转换成Student类型
                //这里的疑惑：已经是同一类型了，为啥还要强制转换成Student类型
                //因为obj是Object类型，转换成其子类Student，这样缩小范围，精准点
                Student stu=(Student)obj;
                //3、看属性值是不是都一样，也就是看不同地址的房产证的信息是不是一样
                if(this.id==stu.id&&this.name==stu.name&&this.age==stu.age){
                    return true;
                }
            }
        }

        return (this == obj);
    }
}
