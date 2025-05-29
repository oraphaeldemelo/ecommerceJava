package com.example.ecommerce.entity.product.exception;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(){
        super("O produto não foi encontrado");
    }
    
}
