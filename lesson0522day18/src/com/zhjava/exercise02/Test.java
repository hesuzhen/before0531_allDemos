package com.zhjava.exercise02;

import java.util.Scanner;

class Student{
    String [] names=new String[20];
    public boolean editName(String oldName,String newName){
        System.out.println("*************修改结果****************");
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(oldName)){
                names[i]=newName;
                return true;
            }
        }
        return  false;
    }
    public void addName2(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    public void showName(){
        System.out.println("*************************************");
        System.out.println("\t\t\t客户姓名列表");
        System.out.println("*************************************");
        for (int a = 0; a < names.length; a++) {
            if(names[a]!=null){
                System.out.print(names[a]+" ");
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入客户姓名：");
            String name = sc.next();
            student.addName2(name);

        }
        student.showName();
        System.out.println();
        System.out.print("请输入要修改的客户姓名：");
        String editName=sc.next();
        System.out.print("请输入新的客户姓名：");
        String newName=sc.next();
        boolean b = student.editName(editName, newName);
        if(b){
            System.out.println("找到并修改成功");
        }else{
            System.out.println("修改失败");
        }
        student.showName();


    }

}
