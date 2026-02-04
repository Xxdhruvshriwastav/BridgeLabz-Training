package CollectorsandStreamAPIproblems;

import java.util.stream.Collectors;
import java.text.Collator;
import java.util.*;

public class AverageAge {

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "Ashish", 21, "male", "IT", 2026, 27500.00),
                new Employee(2, "Dhruv", 10, "male", "Sales", 2014, 30000.00),
                new Employee(3, "Kanika", 18, "female", "PRODUCT", 2011, 27500.00),
                new Employee(4, "Shalni", 13, "female", "Sales", 2026, 27500.00),
                new Employee(5, "Tushar", 11, "male", "IT", 2004, 27500.00),
                new Employee(6, "keshavi", 36, "female", "Sales", 2026, 27500.00),
        		new Employee(7, "kutra", 22, "male", "IT", 2026, 27500.00),
                new Employee(8, "Abhimanyu", 67, "male", "IT", 2026, 27500.00));

        // Average age of male and female Employee

        Map<String, Double> map =

                emp.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingInt(Employee::getAge)));

        System.out.println(map);

        // name 0f the list of employee, passing after 2015

        List<String> name = emp.stream()
                .filter(e -> e.getYearOfPassing() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.print(name);
        
        

        // youngest male employee in the product

        Optional<Employee> youngestEmployee = emp.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("male"))
                .filter(e -> e.getDepartment().equalsIgnoreCase("product"))
                .min(Comparator.comparingInt(Employee::getAge));

        youngestEmployee.ifPresent(e -> System.out.println("The lowest age of an employee is " + e.getAge()
                + ", Name: " + e.getName()));

        // Optional<Employee> moreWorkingExper = emp.stream()
        // .min(Comparator.comparingInt(Employee::getYearOfPassing));

        // if (moreWorkingExper.isPresent()) {
        // Employee e = moreWorkingExper.get();
        // System.out.println("Most working experience employee: " + e.getName());
        // }
        
        System.out.println("");

        Employee moreWorkingExperince =

                emp.stream()
                        .min(Comparator.comparingInt(Employee::getYearOfPassing))
                        .orElse(null);

        System.out.print("The more Workingg experince employee is " + " " + moreWorkingExperince.getName());
        
        System.out.println("");
        
        
        
        Map<String, Long> res =
                emp.stream()
                   .filter(e -> e.getDepartment().equalsIgnoreCase("Sales"))
                   .collect(Collectors.groupingBy(
                           Employee::getGender,
                           Collectors.counting()
                   ));

        		System.out.println("\nmale and female candiadte in sales team is given below");
        		res.forEach((k, v) ->
        
                System.out.print(k + " -> " + v + " ")
        );
        		
        		
        
        System.out.println("");
        
        // average male and female employee saleery		
        
        Map<String, Double> m =

                emp.stream()
                .collect(Collectors.groupingBy(
                Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));

                System.out.println("The average salary of male and female candidate is " + " " + m);
                
                
                
                
                
                
                System.out.println("");
                
                // list of employees in each department
                
                Map<String, List<Employee>> lists =
                		emp.stream()
                		.collect(Collectors.groupingBy(Employee::getDepartment));
                
                lists.forEach((k, v) -> 
                
                		System.out.print(k + " " + v.size() + " ")
                		);
        
    }

}

// groupingBy(key , calculation)
// Key = jo tu batata hai
// Value = calculation ka result