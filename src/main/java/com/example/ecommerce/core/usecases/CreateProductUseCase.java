package com.example.ecommerce.core.usecases;

import com.example.ecommerce.core.entities.Product;

public interface CreateProductUseCase {
    Product execute(Product product);
}
