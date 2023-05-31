package com.zhjava.chap618;

public class Account {
    private long id;
    private double balance;//余额
    private String password;

    public Account() {
    }

    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
            System.out.println("抱歉，密码长度必须是6位");
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

}
