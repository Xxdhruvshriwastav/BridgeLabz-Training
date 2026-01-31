package implementinginterfaces.digitalpaymentinterface;

public class UPI implements DigitalPyment {

	@Override
	public void pay() {
		
		System.out.println("Pay via Upi successfully");
		
	}

}
