package com.zhjava.lesson4;

public class Customer {
    String name;//姓名
    int id;//身份证号
    int tel;//联系电话
    String address;//家庭住址
    String cid;//用户卡号
    double balance;//余额
    public String say(){

        return "姓名："+name+",身份证号："+id+",联系电话："+tel+",家庭地址："+address;
    }
}
