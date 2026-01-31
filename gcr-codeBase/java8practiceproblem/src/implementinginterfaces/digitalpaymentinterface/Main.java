package implementinginterfaces.digitalpaymentinterface;

public class Main {
 
	public static void main(String[] args) {
		DigitalPyment UPI = new UPI();
		DigitalPyment CreditCard = new CreditCard();
		DigitalPyment Wallet = new Wallet();

		
		UPI.pay();
		System.out.println();
		CreditCard.pay();
		System.out.println();
		Wallet.pay();
		
	}
}
