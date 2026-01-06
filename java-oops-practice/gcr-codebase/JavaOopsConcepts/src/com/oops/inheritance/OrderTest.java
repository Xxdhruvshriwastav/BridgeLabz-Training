package com.oops.inheritance;

public class OrderTest {

    public static void main(String[] args) {

        Order o1 = new Order(101, "10-Jan-2025");
        System.out.println(o1.getOrderStatus());
        System.out.println();

        ShippedOrder s1 = new ShippedOrder(102, "11-Jan-2025", "TRK4589");
        System.out.println(s1.getOrderStatus());
        System.out.println();

        DeliveredOrder d1 = new DeliveredOrder(103, "12-Jan-2025",
                "TRK9632", "15-Jan-2025");

        System.out.println(d1.getOrderStatus());
        System.out.println();
        d1.displayDeliveredDetails();
    }
}
