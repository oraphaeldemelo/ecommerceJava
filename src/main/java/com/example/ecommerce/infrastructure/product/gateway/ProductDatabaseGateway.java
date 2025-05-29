package com.example.ecommerce.infrastructure.product.gateway;

import java.util.List;

import com.example.ecommerce.entity.product.gateway.ProductGateway;
import com.example.ecommerce.entity.product.model.Product;
import com.example.ecommerce.infrastructure.config.db.repository.ProductRepository;
import com.example.ecommerce.infrastructure.config.db.schema.ProductSchema;

public class ProductDatabaseGateway implements ProductGateway {
    
    private final ProductRepository productRepository;

    public ProductDatabaseGateway(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return this.productRepository.save(new ProductSchema(product)).toProduct();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(ProductSchema::toProduct).toList();
    }
}
