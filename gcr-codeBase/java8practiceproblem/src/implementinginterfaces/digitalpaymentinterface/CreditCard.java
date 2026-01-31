package implementinginterfaces.digitalpaymentinterface;

public class CreditCard implements DigitalPyment {

	@Override
	public void pay() {
		System.out.println("Pay via CreditCard");
		
	}

}
