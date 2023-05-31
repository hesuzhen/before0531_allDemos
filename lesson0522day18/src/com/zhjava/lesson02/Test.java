package com.zhjava.lesson02;

class ZhaZhi{
    public String zha(String fruitname,int num){
        String str=fruitname+"Ö­"+num+"±­";
       return  str;
    }
}
public class Test {


    public static void main(String[] args) {
        ZhaZhi zhaZhi = new ZhaZhi();
        System.out.println(zhaZhi.zha("Ã¢¹û",6));

    }
}
