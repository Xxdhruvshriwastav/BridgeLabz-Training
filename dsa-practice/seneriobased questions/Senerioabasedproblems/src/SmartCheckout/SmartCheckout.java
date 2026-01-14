package SmartCheckout;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    // Add customer to queue
    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " added to billing queue");
    }

    // Remove & bill customer
    public void processCustomer() {

        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = queue.poll();
        int totalBill = 0;

        System.out.println("Billing customer: " + customer.name);

        for (String item : customer.items) {

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " price not found");
                continue;
            }

            if (stockMap.get(item) > 0) {
                totalBill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            } else {
                System.out.println(item + " is OUT OF STOCK");
            }
        }

        System.out.println("Total Bill = ₹" + totalBill);
        System.out.println("--------------------------------");
    }
}
