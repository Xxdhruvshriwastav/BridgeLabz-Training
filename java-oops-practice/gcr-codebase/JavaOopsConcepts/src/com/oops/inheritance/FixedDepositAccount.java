package com.oops.inheritance;

class FixedDepositAccount extends BankAccount {

    public int lockInPeriod; // months

    FixedDepositAccount(long accountNumber, String accountHolder,
            double balance, int lockInPeriod) {

        super(accountNumber, accountHolder, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayFDAInfo() {
        displayAccountDetails();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}
