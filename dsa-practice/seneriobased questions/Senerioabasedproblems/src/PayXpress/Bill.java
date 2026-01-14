package PayXpress;

public abstract class Bill implements IPayable {

    private String type;          
    private double amount;        
    private String dueDate;
    private boolean isPaid;       

    protected Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    
    public boolean isPaid() {
        return isPaid;
    }

    protected double getAmount() {
        return amount;
    }

    protected void markPaid() {
        this.isPaid = true;
    }

   
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }
}
