package defaultmethodinterface.paymentprocessor;

public class PaytmPayment implements PaymentProcessor {

@Override
public void pay(double amount) {
    System.out.println("Paid ₹" + amount + " using Paytm");
}
}
