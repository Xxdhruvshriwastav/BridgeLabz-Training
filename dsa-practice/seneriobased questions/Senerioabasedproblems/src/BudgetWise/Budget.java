package BudgetWise;
import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits = new HashMap<>();
    protected List<Transaction> transactions = new ArrayList<>();

    public Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
    }

    public void setCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    // Controlled way to add expense
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    public double netSavings() {
        return income - totalExpenses();
    }
}
