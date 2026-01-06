package com.oops.encapsulation;

class BankingMain {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SB001", "Sandeep", 50000);
        BankAccount acc2 = new CurrentAccount("CA101", "Rohit", 70000);

        BankAccount accounts[] = { acc1, acc2 };

        for (BankAccount a : accounts) {
            System.out.println("\nAccount: " + a.getAccountNumber());
            System.out.println("Holder: " + a.getHolderName());
            System.out.println("Interest: " + a.calculateInterest());
        }
    }
}