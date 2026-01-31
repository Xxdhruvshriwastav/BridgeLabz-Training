package methodrefrence.NameUpperCasing;

import java.util.ArrayList;
import java.util.List;

import methodrefrencehospitalprintingid.Patient;

public class NameUppercasing {

	public static void main(String[] args) {
		
		List<Employee> em = List.of(
		
				new Employee("Ashish", 101),
				new Employee("RAvi", 105),
				new Employee("Shriyansh", 107),
				new Employee("Swaraj", 109),
				new Employee("Ritesh", 111)
				
				
				);
				
		em.stream()
		 .map(Employee:: getName)
		 .map(String::toUpperCase)    
         .forEach(System.out::println);
		
				
	}
}
