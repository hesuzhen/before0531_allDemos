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
    /*������Ҫ��дһ��equals��������Ϊ��ʵ�������У�����ѧ�����������ֵ����һ����
    ��������˵��Ӧ�÷���true��������Ĭ�ϵ�equals�����У����ص���false��������Ҫ��дһ��
    ֮������������д��Object��������ĸ���
    */
    public boolean equals(Object obj) {
        //�����ֵַ�ǲ�һ���ģ���ô����false
        //this����ǰ�������equals�����Ķ�������ָ����s1
        //��ֵַһ����ʱ��
        if(this==obj){
            return true;
        }
        //��ֵַ��һ����������ָ�������ֵ��һ����ʱ��
        if(this!=obj){
            //1���ж��ǲ��Ǻ�Student��ͬһ�����ͣ����Ӳ�һ�����ж��ǲ���ͬһ����
            if(obj instanceof  Student){
                //2����ͬһ�������ˣ���objת����Student����
                //������ɻ��Ѿ���ͬһ�����ˣ�Ϊɶ��Ҫǿ��ת����Student����
                //��Ϊobj��Object���ͣ�ת����������Student��������С��Χ����׼��
                Student stu=(Student)obj;
                //3��������ֵ�ǲ��Ƕ�һ����Ҳ���ǿ���ͬ��ַ�ķ���֤����Ϣ�ǲ���һ��
                if(this.id==stu.id&&this.name==stu.name&&this.age==stu.age){
                    return true;
                }
            }
        }

        return (this == obj);
    }
}
