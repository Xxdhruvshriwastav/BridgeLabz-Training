package day5.FoodLoop;

public class FoodItem {
public String name;
public String category;
public int  price;
private int availability;


public int getAvailability() {
	return availability;
}

public FoodItem(String name,String category, int  price, int availability ) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}


}
