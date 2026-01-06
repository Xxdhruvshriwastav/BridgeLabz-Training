 package com.oops.encapsulation;

 class PartTimeEmployee extends Employee implements Department {

	    private int workHours;
	    private String department;

	    public PartTimeEmployee(int id, String name, double salary, int workHours) {
	        super(id, name, salary);
	        this.workHours = workHours;
	    }

	    @Override
	    public double calculateSalary() {
	        return getBaseSalary() * workHours;
	    }

	    @Override
	    public void assignDepartment(String deptName) {
	        department = deptName;
	    }

	    @Override
	    public String getDepartmentDetails() {
	        return "Department: " + department;
	    }
	}
