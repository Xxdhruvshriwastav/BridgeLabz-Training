package TailorShop;
import java.util.*;



public class TailorShop {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        // Already sorted orders
        orders.add(new Order("Ravi", 2));
        orders.add(new Order("Amit", 5));
        orders.add(new Order("Suresh", 8));

        // New orders arrive (real-time)
        orders.add(new Order("Ashish", 4));
        orders.add(new Order("Ritesh", 1));

        // INSERTION SORT
        insertionSort(orders);

       
        for (Order o : orders) {
            System.out.println(o.customerName + " → Day " + o.deadlineDay);
        }
    }

    // INSERTION SORT METHOD
    public static void insertionSort(List<Order> list) {

        for (int i = 1; i < list.size(); i++) {

            Order key = list.get(i);
            int j = i - 1;

            // shift bigger deadlines to right
            while (j >= 0 && list.get(j).deadlineDay > key.deadlineDay) {
                list.set(j + 1, list.get(j));
                j--;
            }

            // insert order at correct position
            list.set(j + 1, key);
        }
    }
}
