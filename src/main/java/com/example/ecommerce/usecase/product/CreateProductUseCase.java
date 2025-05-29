package com.example.ecommerce.usecase.product;

import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.product.gateway.ProductGateway;
import com.example.ecommerce.entity.product.model.Product;
import com.example.ecommerce.usecase.product.dto.ICreateProductDTO;

@Service
public class CreateProductUseCase {
    private final ProductGateway productGateway;

    public CreateProductUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public Product execute(ICreateProductDTO dados){
        Product product = new Product(dados.name(), dados.price());

        return this.productGateway.create(product);
    }
}
