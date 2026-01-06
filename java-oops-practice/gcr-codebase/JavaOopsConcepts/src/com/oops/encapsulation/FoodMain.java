package com.oops.encapsulation;

class FoodMain {

    static void processOrder(FoodItem item) {

        item.getItemDetails();
        double total = item.calculateTotalPrice();

        if (item instanceof Discountable)
            total -= ((Discountable) item).applyDiscount();

        System.out.println("Final Bill: " + total);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        FoodItem order[] = {
                new VegItem("Paneer Roll", 120, 2),
                new NonVegItem("Chicken Biryani", 250, 1)
        };

        for (FoodItem f : order)
            processOrder(f);
    }
}
