package com.inheritance;

public class ShippedOrder extends Order {

    public String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    void displayShippedDetails() {

        displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
