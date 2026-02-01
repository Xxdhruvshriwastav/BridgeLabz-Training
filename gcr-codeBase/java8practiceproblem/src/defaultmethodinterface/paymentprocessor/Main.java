package defaultmethodinterface.paymentprocessor;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor p1 = new PaytmPayment();
		PaymentProcessor p2 = new PhonePePayment();
		
		p1.pay(1000);
		p1.refund(400);
		
		p2.pay(2000);
		p2.refund(500);
		
	}
}
