package com.example.ecommerce.entity.product.gateway;

import java.util.List;
import java.util.Optional;

import com.example.ecommerce.entity.product.model.Product;

public interface ProductGateway {
    Product create(Product product);
    List<Product> findAll();
}
