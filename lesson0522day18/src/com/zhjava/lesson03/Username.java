package com.zhjava.lesson03;
import java.util.*;
public class Username {
    //数组类
    String [] names=new String[20];
    Student [] names1=new Student[20];
    public  boolean storageName(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                System.out.println("存入成功");
                return true;
            }else{
                System.out.println("啊哦~没空位了，不能存了呢");
                return false;
            }

        }
        return false;
    }
    //显示输入过的方法
    public  boolean alreadyInputMethod(String methodname){
        for (int i = 0; i <names.length ; i++) {
            if(methodname.equals(names[i])){
                System.out.println("输入过");
                return true;
            }else{
                System.out.println("没有输入过");
                return false;
            }
        }
        return false;
    }
    //在指定的区间找我们需要的name
    public boolean findName(int index1,int index2,String name){

            for (int i = 0; i < names.length ; i++) {
                if(names[i]!=null){
                    //有这个下标
                    if(i>=index1&&i<=index2){
                        //判断是否有这个值
                        if(names[i].equals(name)){
                            System.out.println("有这个name");
                            return true;
                        }else{
                            System.out.println("没有这个name");
                            return false;
                        }

                    }else{
                        System.out.println("范围超了");
                    }
                }

            }


        return false;
    }
    //同时增加多个student的信息
    public void addStuInfo(Student stu){
        for (int i = 0; i <names1.length ; i++) {
            if(names1[i]==null){
                names1[i]=stu;
                break;
            }
        }
    }
    //显示student信息
    public void showStuInfo(Student stu){
        for (int i = 0; i <names1.length; i++) {
            if(names1[i]!=null){
                stu.show();
                break;
            }
        }


    }
}
