package com.example.ecommerce.infrastructure.product.dto;

import com.example.ecommerce.entity.product.model.Product;
import com.example.ecommerce.usecase.product.dto.IListProductDTO;

public record ProductPublicData(String id, String name, Double price) implements IListProductDTO {
    
    public ProductPublicData(Product product) {
        this(product.getId().toString(), product.getName(), product.getPrice());
    }
}
