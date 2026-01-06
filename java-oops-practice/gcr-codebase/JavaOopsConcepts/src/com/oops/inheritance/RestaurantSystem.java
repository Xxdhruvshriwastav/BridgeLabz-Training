package com.oops.inheritance;

public class RestaurantSystem {

    public static void main(String[] args) {

        Chef c1 = new Chef("Gordon Ramsay", 54, "Italian Cuisine");
        Waiter w1 = new Waiter("Vedan", 28, "Evening");
        c1.displayInfo();
        c1.performDuties();
        w1.displayInfo();
        w1.performDuties();
    }
}
