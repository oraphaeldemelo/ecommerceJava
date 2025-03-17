package com.example.ecommerce.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.api.dtos.ProductRequestDTO;
import com.example.ecommerce.api.dtos.ProductResponseDTO;
import com.example.ecommerce.core.entities.Product;
import com.example.ecommerce.core.usecases.CreateProductUseCase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private final CreateProductUseCase createProductUseCase;

    public ProductController(CreateProductUseCase createProductUseCase) {
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping("/")
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO requestDTO) {
        Product product = new Product(null, requestDTO.getName(), requestDTO.getPrice());

        Product createdProduct = createProductUseCase.execute(product);

        ProductResponseDTO responseDTO = new ProductResponseDTO(createdProduct.getId(), createdProduct.getName(), createdProduct.getPrice());
        
        return ResponseEntity.ok(responseDTO);
    }
    
}
