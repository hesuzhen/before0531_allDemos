package com.zhjava.exercise05;

public class Complex {
    /*
           写一个类Complex，用来表示复数。这个复数类具有两个属性：double real，
        表示实部；double im，表示虚部。并为Complex 类增加add、sub、mul 方法，
        分别表示复数的加法、减法和乘法运算。其中，add 方法的声明如下：
        public Complex add(Complex c) //表示当前Complex 对象与参数c 对象相加
        public Complex add(double real) //表示当前 Complex 对象与实数 real 相加
    */
    private double real;//实部
    private double im;//虚部
    public Complex(){}
    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    //加法：复数与复数相加
    //表示当前Complex 对象与参数c 对象相加
    public Complex add(Complex c){
        /*
        double i=1;
       // i=-(i*i);
       c=c.real+c.im*i;
        */
       // Complex thiscomplex = new Complex();
        //thiscomplex+c=this.real+this.im+c.real+c.im;
        c.setReal(real+c.getReal());
        c.setIm(im+c.getIm());
        return c;
    }
    //加法：复数与实数相加
    //表示当前 Complex 对象与实数 real 相加
    /*
    public Complex add(double real){
        //this.real+real;

    }
   */
}
