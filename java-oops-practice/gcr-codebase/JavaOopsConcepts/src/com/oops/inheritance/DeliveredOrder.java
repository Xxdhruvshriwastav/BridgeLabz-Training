package com.oops.inheritance;

public class DeliveredOrder extends ShippedOrder {

    public String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
            String trackingNumber, String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public void displayDeliveredDetails() {
        displayShippedDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
