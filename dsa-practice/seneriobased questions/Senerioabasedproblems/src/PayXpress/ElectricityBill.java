package PayXpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(50); // penalty
        markPaid();
        System.out.println("Electricity Bill paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Electricity bill due soon. Avoid power disconnection!");
    }
}

