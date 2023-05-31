package com.zhjava.chap707;

class MyClass{
 final int value;
 public MyClass(){
     value=10;

 }
 public MyClass(int value){
     this.value = value;
        }
}
 public class TestMain{
 public static void main(String args[]){
        MyClass mc = new MyClass(10);
         System.out.println(mc.value);
        }
}