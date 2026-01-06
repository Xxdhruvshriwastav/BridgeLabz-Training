package com.oops.inbuiltFunction;

public class BankAccount {
	
	private String accountHolderName;
	private final String accountNumber;
	private double balance;

	public static int totalAccounts = 0;
	public static String bankName = "Bank of Baroda";
	
	public static void getTotalAcoounts() {
		System.out.println("Total Number of Bank Accounts are: " + totalAccounts);	
	}
	
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}
	
	public void displayAccountDetails() {
		if(this instanceof BankAccount) {
			System.out.println("Bank Name: " + bankName);
			System.out.println("Accout Holder Name is: " + accountHolderName);
			System.out.println("Accout Number is: " + accountNumber);
			System.out.println("Current Balance is: " + balance);
		}
		else {
			System.out.println("Invalid Account Instance");
		}
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public double balance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			balance += amount;
			System.out.println("Amount Deposit Successfully");
			System.out.println("Deposit Amount" + amount);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= amount;
			System.out.println("Amount Withdraw Successfully");
			System.out.println("Withdraw Amount" + amount);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two bank accounts
	       BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
	       BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
	       // Display account details
	       System.out.println("\nAccount 1 Details:");
	       account1.displayAccountDetails();
	       System.out.println("\nAccount 2 Details:");
	       account2.displayAccountDetails();
	       // Check total accounts
	       getTotalAcoounts();
	       // Deposit and withdraw operations
	       System.out.println("\nPerforming transactions on Account 1:");
	       account1.deposit(200);
	       account1.withdraw(150);
	       account1.displayAccountDetails();
	       account2.displayAccountDetails();
	       account2.deposit(100);
	       account2.withdraw(800);

	}

}
