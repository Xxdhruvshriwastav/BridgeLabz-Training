package com.inheritance;

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(long accountNumber, String accountHolder,
            double balance, double interestRate) {

        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {

        // accessing public + protected members
        System.out.println("Savings Account Number: " + accountNumber); // public ✔
        System.out.println("Account Holder: " + accountHolder); // protected ✔

        // balance is private → must use getter
        System.out.println("Balance: " + getBalance());

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("---------------------------");
    }
}
