package com.zhjava.exercise05;

public class Complex {
    /*
           дһ����Complex��������ʾ�������������������������ԣ�double real��
        ��ʾʵ����double im����ʾ�鲿����ΪComplex ������add��sub��mul ������
        �ֱ��ʾ�����ļӷ��������ͳ˷����㡣���У�add �������������£�
        public Complex add(Complex c) //��ʾ��ǰComplex ���������c �������
        public Complex add(double real) //��ʾ��ǰ Complex ������ʵ�� real ���
    */
    private double real;//ʵ��
    private double im;//�鲿
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
    //�ӷ��������븴�����
    //��ʾ��ǰComplex ���������c �������
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
    //�ӷ���������ʵ�����
    //��ʾ��ǰ Complex ������ʵ�� real ���
    /*
    public Complex add(double real){
        //this.real+real;

    }
   */
}
