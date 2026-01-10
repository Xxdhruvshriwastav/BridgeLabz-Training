package day5.MediStore;

public abstract class Medicine implements ISellable {

public String name;
private double price;
public int expiryDate;
public int quantity;


		public Medicine(String name, int expiryDate, int quantity ) {
			this.name = name;
			this.expiryDate = expiryDate;
			this.quantity = quantity;
		}
		
		
		public double getPrice() {
			return price;
		}


		@Override
		public boolean sell() {
			
			if(checkExpiry()) {
				 System.out.println(name + " expired");
		            return false;
			}
			
			if (quantity <= 0) {
	            System.out.println("Out of stock");
	            return false;
	        }
			
			quantity--;
	        System.out.println(name + " sold. Remaining: " + quantity);
	        return true;
		}
		
}
