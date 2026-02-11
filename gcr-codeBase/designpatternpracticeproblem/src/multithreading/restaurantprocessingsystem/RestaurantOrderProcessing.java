package multithreading.restaurantprocessingsystem;

public class RestaurantOrderProcessing {

	public static void main(String[] args)  {
		
		Thread t1 = new Thread(new Chef("Chef-1", "pizza", 3000));
		Thread t2 = new Thread(new Chef("Chef-2", "Pasta", 4000));
		Thread t3 = new Thread(new Chef("Chef-3", "Salad", 5000));
		Thread t4 = new Thread(new Chef("Chef-4", "Burger", 6000));
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
	}
}
