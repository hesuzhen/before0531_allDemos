package com.zhjava.exercise03;

import java.util.Scanner;

class Student{

    public double averageScore(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double score=sum/5;
        return score;
    }
    public int maxScore(int [] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
public class Test {
    public static void main(String[] args) {
        int score[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("������5�������ߵĳɼ���");
        for (int i = 0; i < score.length; i++) {
           score[i] = sc.nextInt();
        }
        Student student = new Student();
        System.out.println("ƽ���ɼ���"+student.averageScore(score));
        System.out.println("��߳ɼ���"+student.maxScore(score));

    }
}
