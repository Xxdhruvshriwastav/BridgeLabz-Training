package day5.FoodLoop;

public interface IOrderable {

	void placeOrder(int stock, int orders, int price);
	void cancelOrder();
}
