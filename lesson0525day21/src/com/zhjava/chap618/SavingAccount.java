package com.zhjava.chap618;

public class SavingAccount {
    //�����˻�
    private double interestRate;//�������

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
            System.out.println("���ʴ���0����С�ڰٷ�֮10");
        }

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
