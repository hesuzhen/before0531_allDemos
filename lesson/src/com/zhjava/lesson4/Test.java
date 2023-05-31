package com.zhjava.lesson4;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Customer customer = new Customer();
        customer.balance=100;
        account.customer=customer;
        //System.out.println(account.withdraw());

        customer.cid="666";
        account.customer=customer;
        customer.name="张三";
        System.out.println( account.save());


    }
}
