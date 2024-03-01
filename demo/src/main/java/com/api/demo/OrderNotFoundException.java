package com.api.demo;

public class OrderNotFoundException extends RuntimeException{
    
    OrderNotFoundException(Long id) {
        super("Order id is not found: " + id);
    }
}
