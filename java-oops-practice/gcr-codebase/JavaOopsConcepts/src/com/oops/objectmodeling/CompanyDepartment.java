package com.oops.objectmodeling;

public class CompanyDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Company company = new Company("TechCorp");
		 Company company2 = new Company("Google");

	        // Create Departments
	        Department dept1 = new Department("Software", company);
	        Department dept2 = new Department("HR", company2);
	        
	        Employee emp1 = new Employee("Alice", 101, dept1);
	        Employee emp2 = new Employee("Bob", 102, dept1);
	        Employee emp3 = new Employee("Charlie", 201, dept2);
	        Employee emp4 = new Employee("David", 202, dept2);

	        // Add Employees to the departments
	        dept1.addEmployee(emp1);
	        dept1.addEmployee(emp2);
	        dept2.addEmployee(emp3);
	        dept2.addEmployee(emp4);

	        // Add departments to the company
	        company.addDepartment(dept1);
	        company.addDepartment(dept2);

	        // Display all departments and employees in the company
	        company.showDepartments();
	        company2.showDepartments();
	        
	        // Display Employees
	        dept1.displayEmployees();
	        dept2.displayEmployees();
	}

}
