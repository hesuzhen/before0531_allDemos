package com.zhjava.lesson03;

public class Test2 {
    //声明一个String类型的20个长度的数组类存放用户输入的姓名，用户输入姓名
    public static void main(String[] args) {
        Username username = new Username();
        System.out.println(username.storageName("煤球"));
        System.out.println(username.findName(1,2,"煤球"));

    }


}
