package com.example.ecommerce.infrastructure.config.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ecommerce.entity.product.gateway.ProductGateway;
import com.example.ecommerce.infrastructure.config.db.repository.ProductRepository;
import com.example.ecommerce.infrastructure.product.gateway.ProductDatabaseGateway;
import com.example.ecommerce.usecase.product.CreateProductUseCase;
import com.example.ecommerce.usecase.product.ListAllProductsUseCase;

@Configuration
public class MvcConfig {

    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepository productRepository){
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new CreateProductUseCase(productGateway);
    }

    @Bean
    public ListAllProductsUseCase listAllProductsUseCase(ProductRepository productRepository){
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new ListAllProductsUseCase(productGateway);
    }
    
}
