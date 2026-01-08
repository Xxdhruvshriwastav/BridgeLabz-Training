package day5.LoanBuddy;

public class Loan extends LoanApplication implements IApprovable {

    private Applicant applicant;

    public Loan(Applicant applicant, int numOfPeriod) {
        super("Personal Loan", numOfPeriod, 0.10);
        this.applicant = applicant;
    }

    @Override
    public boolean approveLoan() {
        return applicant.getCreditScore() > 500;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = numOfPeriod;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
        
    }
}
