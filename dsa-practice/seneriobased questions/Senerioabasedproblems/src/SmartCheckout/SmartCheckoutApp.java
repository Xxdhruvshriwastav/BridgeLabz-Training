package SmartCheckout;

import java.util.*;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        // Price setup
        checkout.priceMap.put("Milk", 50);
        checkout.priceMap.put("Bread", 30);
        checkout.priceMap.put("Eggs", 10);

        // Stock setup
        checkout.stockMap.put("Milk", 5);
        checkout.stockMap.put("Bread", 2);
        checkout.stockMap.put("Eggs", 12);

        Customer c1 = new Customer("Ravi",
                Arrays.asList("Milk", "Bread", "Eggs"));

        Customer c2 = new Customer("Amit",
                Arrays.asList("Milk", "Milk", "Bread"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
    }
}
