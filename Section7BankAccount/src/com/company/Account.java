package com.company;

public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

//constructors
    public Account(int number, double balance, String customerName, String email, int phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(){
        this(5504, 0.00, "BEao", "DAA3q", 5555555);
    }

    public Account(String customerName, String email, int phoneNumber) {
        this(55445, 5.55, customerName, email, phoneNumber);
    }

    //methods
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed.");
    }

    public void withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Only " + balance + " available. Withdraw not processed.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed.");
        }
    }

    //getters and settters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
