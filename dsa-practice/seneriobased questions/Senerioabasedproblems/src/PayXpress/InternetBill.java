package PayXpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(30);
        markPaid();
        System.out.println("Internet Bill paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Internet bill pending. Speed may be reduced!");
    }
}

