package com.oops.objectmodeling;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private String branchName;
	
	public Bank(String bankName, String branchName){
		this.bankName = bankName;
		this.branchName = branchName;
	}
	
	public void openAccount(Customer customer, int accNo, double balance) {
		Account account = new Account(accNo, balance);
		customer.addAccount(account);
		
		System.out.println("Account Open Successfully-----");
		System.out.println("Account Holder Name: " + customer.getName());
		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch Name: " + branchName);
	}
	
	
}
