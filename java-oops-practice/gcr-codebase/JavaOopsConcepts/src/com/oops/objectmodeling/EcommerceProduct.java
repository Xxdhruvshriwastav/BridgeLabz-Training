package com.oops.objectmodeling;

public class EcommerceProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerEcom customer = new CustomerEcom("C1", "Alex");
		Order order = new Order("O1");

		order.addProduct(new ProductEcom("P1", "Earbuds", 2700));
		order.addProduct(new ProductEcom("P2", "Pendrive", 500));

		customer.placeOrder(order);

		System.out.println(order.calculateTotal());

	}
}
