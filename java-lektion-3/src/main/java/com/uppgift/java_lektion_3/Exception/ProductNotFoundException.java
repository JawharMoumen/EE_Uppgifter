package com.uppgift.java_lektion_3.Exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String name) {
        super("Product not found: " + name);

    }

}
