package com.oops.objectmodeling;

public class BankAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("State Bank of India", "Bhopal");

        Customer c1 = new Customer(101, "Amit", bank);
        Customer c2 = new Customer(102, "Riya", bank);

        bank.openAccount(c1, 1001, 5000);
        bank.openAccount(c1, 1002, 12000);
        bank.openAccount(c2, 2001, 8000);

        System.out.println();
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
	}

}
