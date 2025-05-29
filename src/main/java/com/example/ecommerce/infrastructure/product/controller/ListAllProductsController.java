package com.example.ecommerce.infrastructure.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.entity.product.model.Product;
import com.example.ecommerce.infrastructure.product.dto.ProductPublicData;
import com.example.ecommerce.usecase.product.ListAllProductsUseCase;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ListAllProductsController {
    
    private final ListAllProductsUseCase listAllProductsUseCase;

    public ListAllProductsController(ListAllProductsUseCase listAllProductsUseCase) {
        this.listAllProductsUseCase = listAllProductsUseCase;
    }

    @GetMapping("/product")
    public List<ProductPublicData> listAllData() {
        List<Product> products = this.listAllProductsUseCase.execute();

        return products.stream().map(ProductPublicData::new).toList();
    }
    
}
