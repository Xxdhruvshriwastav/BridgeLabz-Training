package com.oops.objectmodeling;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int custID;
	private ArrayList<Account> accounts;
	private Bank bank;
	
	public Customer(int custID, String name, Bank bank){
		this.custID = custID;
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void viewBalance() {
		System.out.println("Customer Name: " + name);
		
		for(Account acc: accounts) {
			System.out.println("Account No: " + acc.getAccountNumber()
            + ", Balance: ₹" + acc.getBalance());
		}
	}
	
	public String getName() {
        return name;
    }
}
