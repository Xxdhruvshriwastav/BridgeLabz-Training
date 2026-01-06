package com.inheritance;

public class BankTest {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1234567890L, "Rudra", 5000);
        b1.displayAccountDetails();

        // modify balance using public methods
        b1.deposit(2000);
        b1.withdraw(1000);

        System.out.println("Updated Balance: " + b1.getBalance());
        System.out.println();

        SavingsAccount s1 = new SavingsAccount(9876543210L, "Ashish", 15000, 5.5);

        s1.displaySavingsAccountDetails();

        s1.deposit(3000);
        System.out.println("Updated Savings Balance: " + s1.getBalance());
    }
}
