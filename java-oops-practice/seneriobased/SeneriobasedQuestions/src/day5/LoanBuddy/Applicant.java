package day5.LoanBuddy;

public class Applicant {

	public String name;
	private int creditScore;
	public int income;
	public int loanAmount;
	
	// get method
	public int getCreditScore() {
		return creditScore;
	}
	
	public int getLoanAmount() {
		
		return loanAmount;
	}
	
	    Applicant(int creditScore, String name, int income, int loanAmount) {
	    this.creditScore = creditScore;
		this.name = name;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	
	
	
	
	
	
}
