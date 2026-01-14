package BudgetWise;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expense: " + totalExpenses());
        System.out.println("Yearly Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("Annual budget exceeded!");
        }
    }
}
