package com.example.ecommerce.infrastructure.product.dto;

import com.example.ecommerce.entity.product.model.Product;
import com.example.ecommerce.usecase.product.dto.ICreateProductDTO;

public record ProductPublicData(String name, Double price) implements ICreateProductDTO {
    
    public ProductPublicData(Product product) {
        this(product.getName(), product.getPrice());
    }
}
