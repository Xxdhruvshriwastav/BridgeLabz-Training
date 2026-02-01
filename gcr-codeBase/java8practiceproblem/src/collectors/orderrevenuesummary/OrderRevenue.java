package collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customers = List.of(new Customer("Ashish",5),
											new Customer("Dhruv",2),
											new Customer("Chandu",15),
											new Customer("Aankha",3),
											new Customer("Dabbu",8));
		
		Map<String,Double> orders = customers.stream()
				.collect(Collectors.groupingBy(Customer::getName,Collectors.summingDouble(Customer::getOrder)));
		
		orders.forEach((name,total)-> System.out.println(name+" -> "+total));
	}

}
