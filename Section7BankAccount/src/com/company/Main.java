package com.company;

public class Main {

    public static void main(String[] args) {
	Account bob = new Account(12345, 0.00, "Bob Brown", "email.com", 258588);
	bob.deposit(500);
	bob.withdraw(25);

    }
}
