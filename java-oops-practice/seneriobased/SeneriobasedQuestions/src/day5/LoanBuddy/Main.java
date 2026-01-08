package day5.LoanBuddy;

public class Main {
    public static void main(String[] args) {

        Applicant a = new Applicant(650, "Ashish", 40000, 500000);
        Loan loan = new Loan(a, 60);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved ");
            System.out.println("EMI = " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected ");
        }
    }
}
