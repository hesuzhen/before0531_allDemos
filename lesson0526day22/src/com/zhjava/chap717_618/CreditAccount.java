package com.zhjava.chap717_618;

public class CreditAccount {
    //�����˻�
    private double creditLine;//���ö��

    public CreditAccount() {
    }

    public CreditAccount(double creditLine) {
        this.creditLine = creditLine;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "creditLine=" + creditLine +
                '}';
    }
}
