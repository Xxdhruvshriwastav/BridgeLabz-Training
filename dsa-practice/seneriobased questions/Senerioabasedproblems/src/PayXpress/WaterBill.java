package PayXpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(20);
        markPaid();
        System.out.println("Water Bill paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water bill due. Please pay to avoid supply issues.");
    }
}

