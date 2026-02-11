package multithreading.bankingsystem;

public class Transaction implements Runnable {

	private BankAcc account;
	private String customerName;
	private int amount;
	
	public  Transaction(BankAcc account, String customerName, int amount ) {
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	
	@Override
	public void run() {
		
		account.withdraw(customerName, amount);
		
	}

	

}
