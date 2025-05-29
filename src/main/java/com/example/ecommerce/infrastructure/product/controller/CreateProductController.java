package com.example.ecommerce.infrastructure.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.infrastructure.product.dto.CreateProductDto;
import com.example.ecommerce.infrastructure.product.dto.ProductPublicData;
import com.example.ecommerce.usecase.product.CreateProductUseCase;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class CreateProductController {

    private final CreateProductUseCase createProductUseCase;
    
    public CreateProductController(CreateProductUseCase createProductUseCase){
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductPublicData createProduct(@RequestBody CreateProductDto values) { 
        return new ProductPublicData(createProductUseCase.execute(values));
    }
    
    
}
