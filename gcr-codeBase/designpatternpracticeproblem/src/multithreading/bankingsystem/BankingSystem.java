package multithreading.bankingsystem;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankAcc account = new BankAcc();
		
	    Thread t1 = new Thread(new Transaction(account, "customer-1", 2000));
	    Thread t2 = new Thread(new Transaction(account, "customer-2", 200));
	    Thread t3 = new Thread(new Transaction(account, "customer-3", 2090));
	    Thread t4 = new Thread(new Transaction(account, "customer-4", 50));
	    Thread t5 = new Thread(new Transaction(account, "customer-5", 10));
	
	    t1.setPriority(10); // 10 has max priority
	    t2.setPriority(5); // normal priority
	    t3.setPriority(1);  // min priority
	    t4.setDaemon(false); // just for testing, basically this is backound thread, 
	                         // if i do true then it run only on background
	    
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	    
	    
	}
	
}
