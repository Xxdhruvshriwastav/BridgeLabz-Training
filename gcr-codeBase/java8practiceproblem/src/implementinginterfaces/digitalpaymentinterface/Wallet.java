package implementinginterfaces.digitalpaymentinterface;

public class Wallet implements DigitalPyment {

	@Override
	public void pay() {
		
		System.out.println("Paying via Wallet");
		
	}

}
