package com.oops.encapsulation;

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}
