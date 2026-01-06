package com.oops.inheritance;

class BankAccount {

    public long accountNumber; // Public → accessible everywhere
    protected String accountHolder; // Protected → accessible in subclass
    protected double balance; // Private → encapsulated

    // Constructor
    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter → access private balance
    public double getBalance() {
        return balance;
    }

    // Setter → modify private balance safely
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount!");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid or Insufficient Balance!");
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}
