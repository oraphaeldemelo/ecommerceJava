package com.example.ecommerce.usecase.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.product.gateway.ProductGateway;
import com.example.ecommerce.entity.product.model.Product;

@Service
public class ListAllProductsUseCase {
    
    private final ProductGateway productGateway;

    public ListAllProductsUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public List<Product> execute() {
        return this.productGateway.findAll();
    }
}
