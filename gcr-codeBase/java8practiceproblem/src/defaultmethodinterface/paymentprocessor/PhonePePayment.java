package defaultmethodinterface.paymentprocessor;

public class PhonePePayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Paytm");
		
	}

}
