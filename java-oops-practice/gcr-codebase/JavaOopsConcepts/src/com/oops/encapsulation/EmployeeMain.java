package com.oops.encapsulation;

public class EmployeeMain {

	
	 public static void main(String[] args) {

	        Employee emp1 = new FullTimeEmployee(101, "Sandeep", 30000);
	        Employee emp2 = new PartTimeEmployee(102, "Rohit", 500, 20);

	        Employee employees[] = { emp1, emp2 };

	        for (Employee e : employees) {
	            e.displayDetails();
	            System.out.println("Salary: " + e.calculateSalary());
	            System.out.println("--------------------");
	        }
	    }
}
