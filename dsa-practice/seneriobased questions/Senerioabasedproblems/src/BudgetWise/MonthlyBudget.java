package BudgetWise;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : transactions) {
                if (t.getCategory().equals(cat)) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(cat)) {
                System.out.println("Overspent in category: " + cat);
            }
        }
    }
}
