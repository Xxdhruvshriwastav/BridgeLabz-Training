package com.oops.constructor;

public class BankAccount {

	 public long accountNumber;
	    protected String accountHolder;
	    private double balance;

	    // Constructor
	    BankAccount(long accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // Public getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Public setter for balance
	    public void setBalance(double balance) {
	        if (balance >= 0) {
	            this.balance = balance;
	        } else {
	            System.out.println("Invalid balance amount");
	        }
	    }
	
	    public static void main(String[] args) {

	        // Creating BankAccount object
	        BankAccount account = new BankAccount(
	                123456789012L,
	                "Amit Kumar",
	                5000.00
	        );

	        // Accessing public and protected members
	        System.out.println("Account Number: " + account.accountNumber);
	        System.out.println("Account Holder: " + account.accountHolder);

	        // Accessing private member using getter
	        System.out.println("Balance: ₹" + account.getBalance());

	        // Updating balance using setter
	        account.setBalance(7500.50);
	        System.out.println("Updated Balance: ₹" + account.getBalance());
	    }

}
