package day5.Artify;

public class User {

	public String name;
	public int walletBalance;
	
	 public User(String name, int walletBalance) {
	        this.name = name;
	        this.walletBalance =  walletBalance;
	    }
	
	 public boolean deductBalance(double amount) {
	        if (walletBalance >= amount) {
	            walletBalance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public double getWalletBalance() {
	        return walletBalance;
	    }

	    public String getName() {
	        return name;
	    }
}
