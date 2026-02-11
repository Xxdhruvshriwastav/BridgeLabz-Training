package multithreading.bankingsystem;

public class BankAcc {

	private double balance = 5000;
	
	public double getBalance() {
		return balance;
		
	}
	
	public synchronized void withdraw(String customerName, int amount) {
		
		if(balance >= amount) {
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			balance -= amount;
			
			System.out.println("[" + customerName + "]" 
			+ "withdraw the amount of " + amount + " "
			+ "now reaming balance is " + " "
			+ balance + "At time of " + " "
			+ java.time.LocalTime.now());
			
			
			
			
		}  else {
			System.out.println("Transaction failed: "
                    + customerName
                    + ", Insufficient Balance" + "At time of " + " "
                    + java.time.LocalTime.now());
		}
	}
}
