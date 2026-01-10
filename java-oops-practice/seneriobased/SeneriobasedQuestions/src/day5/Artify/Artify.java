package day5.Artify;

public class Artify {

	  public static void main(String[] args) {

	        User user = new User("Ashish", 3000);

	        Artwork a1 = new DigitalAr("Sunset", "Rahul", "Commercial", 2000);
	        Artwork a2 = new PrintArt("Mountain", "Anita", "Personal", 1500);

	        a1.purchase(user);
	        a1.license();

	        System.out.println("Wallet balance: " + user.getWalletBalance());
	        System.out.println();

	        a2.purchase(user);
	        a2.license();

	        System.out.println("Wallet balance: " + user.getWalletBalance());
	    }
	}