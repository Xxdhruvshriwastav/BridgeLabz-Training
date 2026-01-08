package day5.LoanBuddy;

public class LoanApplication {

	public String loanType;
	public int numOfPeriod;
	public double interestRate;
	
	
	LoanApplication(String loanType,int numOfPeriod, double interestRate ) {
		
		this.loanType = loanType;
		this.numOfPeriod = numOfPeriod;
		this.interestRate = interestRate;
	}
	
	
	
}
