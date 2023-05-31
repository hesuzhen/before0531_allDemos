package com.zhjava.chap717_618;

import java.util.Random;

public class Account {
    static  int index=100001;
    final private  long id;
    private double balance;//���
    private String password;

    public Account() {
        id=index++;
    }

    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }
//�Զ�����id����
    public long getId() {
       /* Random random = new Random();
        int id = random.nextInt(100001);*/

        return id;
    }

  /*  public void setId(long id) {
        this.id = id;
    }*/

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        }else{
            System.out.println("��Ǹ�����볤�ȱ�����6λ");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
    //�Զ�����id����


}
