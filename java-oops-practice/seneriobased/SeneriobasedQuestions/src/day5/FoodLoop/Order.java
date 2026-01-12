package day5.FoodLoop;

import java.util.ArrayList;
import java.util.List;


public class Order implements IOrderable{
	public int totalAmount;

	
	
	List<FoodItem> fi = new ArrayList<>();
	
	public Order(List<FoodItem> item) {
		fi.addAll(item);
	}
	
	public double applyDiscout(int bill) {
		if (bill < 500) {
			return bill * 0.9; // 10
		} else if (bill < 1000) {
			return bill * 0.7; // 30 
		} else {
			
			return bill * 0.5;
		}
		
	}
	
	public void billCalculationTotal() {
		
		
		totalAmount = 0;
		for(FoodItem item : fi) {
			totalAmount += item.price ;
		}
		
		double finalTotal = applyDiscout(totalAmount);
		System.out.println(finalTotal);
	}
	
	
	@Override
	public void placeOrder (int stock, int orders, int price) {
		System.out.println("Thanks, Your Order is accepted ");
		System.out.print("The total bill is "); 
		billCalculationTotal();
		
		
	}
	@Override
	public void cancelOrder() {
		
		fi.clear();
		System.out.println("Your order is cancelled");
	}
	
	

}
