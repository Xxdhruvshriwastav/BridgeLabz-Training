package day5.FoodLoop;

import java.util.ArrayList;
import java.util.List;

public class FoodLoop {

    public static void main(String[] args) {

        VegItem f1 = new VegItem("DalMakhni", "veg", 100, 10);
        NonVegItem f2 = new NonVegItem("Butter-Paneer", "nonVeg", 1000, 10);
        VegItem f3 = new VegItem("Pizza", "veg", 400, 1);
        VegItem f4 = new VegItem("Pizza", "veg", 400, 3);

        List<FoodItem> items = new ArrayList<>();
        items.add(f1);
        items.add(f2);
        items.add(f3);
        items.add(f4);

        Order order = new Order(items);
        order.placeOrder(0, 0, 0);
    }
}

