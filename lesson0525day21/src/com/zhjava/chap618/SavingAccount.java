package com.zhjava.chap618;

public class SavingAccount {
    //储蓄账户
    private double interestRate;//存款利率

    public SavingAccount() {
    }

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>0&&interestRate<0.1){
            this.interestRate = interestRate;
        }else{
            System.out.println("利率大于0或者小于百分之10");
        }

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
