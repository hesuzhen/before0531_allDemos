package com.zhjava.lesson03;
import java.util.*;
public class Username {
    //������
    String [] names=new String[20];
    Student [] names1=new Student[20];
    public  boolean storageName(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                System.out.println("����ɹ�");
                return true;
            }else{
                System.out.println("��Ŷ~û��λ�ˣ����ܴ�����");
                return false;
            }

        }
        return false;
    }
    //��ʾ������ķ���
    public  boolean alreadyInputMethod(String methodname){
        for (int i = 0; i <names.length ; i++) {
            if(methodname.equals(names[i])){
                System.out.println("�����");
                return true;
            }else{
                System.out.println("û�������");
                return false;
            }
        }
        return false;
    }
    //��ָ����������������Ҫ��name
    public boolean findName(int index1,int index2,String name){

            for (int i = 0; i < names.length ; i++) {
                if(names[i]!=null){
                    //������±�
                    if(i>=index1&&i<=index2){
                        //�ж��Ƿ������ֵ
                        if(names[i].equals(name)){
                            System.out.println("�����name");
                            return true;
                        }else{
                            System.out.println("û�����name");
                            return false;
                        }

                    }else{
                        System.out.println("��Χ����");
                    }
                }

            }


        return false;
    }
    //ͬʱ���Ӷ��student����Ϣ
    public void addStuInfo(Student stu){
        for (int i = 0; i <names1.length ; i++) {
            if(names1[i]==null){
                names1[i]=stu;
                break;
            }
        }
    }
    //��ʾstudent��Ϣ
    public void showStuInfo(Student stu){
        for (int i = 0; i <names1.length; i++) {
            if(names1[i]!=null){
                stu.show();
                break;
            }
        }


    }
}
