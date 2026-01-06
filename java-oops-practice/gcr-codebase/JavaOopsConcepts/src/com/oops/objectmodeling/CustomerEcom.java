package com.oops.objectmodeling;

import java.util.*;

//Customer class
public class CustomerEcom {
private String customerId;
private String name;
private List<Order> orders = new ArrayList<>();

public CustomerEcom(String customerId, String name) {
   this.customerId = customerId;
   this.name = name;
}

public void placeOrder(Order order) {
   orders.add(order);
}
}
