package com.oops.constructor;

public class Employee {

	 // Access Modifiers
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }
	
    public static void main(String[] args) {

        Manager mgr = new Manager(
                501, "IT", 85000.0, "Project Manager"
        );

        mgr.displayManagerDetails();

        // Modify salary using public method
        mgr.setSalary(95000.0);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }

}
