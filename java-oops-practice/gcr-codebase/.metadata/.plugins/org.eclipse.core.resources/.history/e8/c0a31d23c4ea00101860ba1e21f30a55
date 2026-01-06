package com.inheritance;

class CheckingAccount extends BankAccount {

    public double overdraftLimit;

    CheckingAccount(long accountNumber, String accountHolder,
            double balance, double overdraftLimit) {

        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded!");
    }

    public void displayCheckingInfo() {
        displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
