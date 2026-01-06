package day1;

class Bill implements Payable {

    private double treatmentCost;
    private double tax;
    private double discount;

    public Bill(double treatmentCost) {
        this.treatmentCost = treatmentCost;
        this.tax = 0.18 * treatmentCost;
        this.discount = calculateDiscount(treatmentCost);
    }

    // Helper Method
    private double calculateDiscount(double amount) {
        return amount > 10000 ? amount * 0.10 : 0;
    }

    @Override
    public double calculatePayment() {
        return treatmentCost + tax - discount;
    }
}
