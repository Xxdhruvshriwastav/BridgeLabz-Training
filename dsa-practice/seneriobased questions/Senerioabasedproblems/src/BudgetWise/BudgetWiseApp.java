package BudgetWise;

public class BudgetWiseApp {

    public static void main(String[] args) {

        // Monthly Budget
        MonthlyBudget jan = new MonthlyBudget(50000, 40000);

        jan.setCategoryLimit("Food", 8000);
        jan.setCategoryLimit("Rent", 15000);

        
        jan.addTransaction(new Transaction(6000.0, "EXPENSE", 5, "Food"));
        jan.addTransaction(new Transaction(16000.0, "EXPENSE", 1, "Rent"));

        jan.generateReport();
        jan.detectOverspend();

        System.out.println();

       
        AnnualBudget year = new AnnualBudget(600000, 500000);

       
        year.addTransaction(new Transaction(520000.0, "EXPENSE", 2025, "General"));

        year.generateReport();
        year.detectOverspend();
    }
}
