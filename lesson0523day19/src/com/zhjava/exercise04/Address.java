package com.zhjava.exercise04;
public class Address {
    private String address;
    private String zipCode;
    public Address(){}
    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void show(){
        System.out.println("µÿ÷∑£∫"+address+",” ±‡£∫"+zipCode);
    }
}
