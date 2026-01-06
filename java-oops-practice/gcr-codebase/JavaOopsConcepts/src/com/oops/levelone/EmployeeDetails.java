package com.oops.levelone;

public class EmployeeDetails {

	String name;
	int id;
	double salary;
	
	EmployeeDetails(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails("Karan",101,75000);
		employee.displayEmployee();
	}

}
