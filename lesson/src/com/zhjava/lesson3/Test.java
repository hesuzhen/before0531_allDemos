package com.zhjava.lesson3;

public class Test {
    public static void main(String[] args) {
        Wife wife = new Wife();
        Husband husband = new Husband();
        husband.name="张三";
        husband.age=18;
        wife.name="李四";
        wife.age=16;
        husband.wife=wife;
        wife.husband=husband;
        /*
        husband.wife.name="李四";
        husband.wife.age=16;*/



       wife.show();
      husband.getInfo();

    }

}
