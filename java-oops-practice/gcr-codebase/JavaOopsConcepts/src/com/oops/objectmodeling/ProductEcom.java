package com.oops.objectmodeling;


import java.util.ArrayList;
import java.util.List;

// Product class
public class ProductEcom {
    private String productId;
    private String name;
    private double price;

    public ProductEcom(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
