package com.zhjava.lesson05;

public class TestPrint {
    public static void main(String[] args) {
        Print print = new Print();
        Box b=new Colorful();
        Paper p=new A4();
        print.setBox(b);
        print.setPaper(p);
        print.show();
    }

}
