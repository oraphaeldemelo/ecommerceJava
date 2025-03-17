package com.example.ecommerce.core.usecases.impl;

import com.example.ecommerce.core.entities.Product;
import com.example.ecommerce.core.exceptions.BusinessException;
import com.example.ecommerce.core.usecases.CreateProductUseCase;
import com.example.ecommerce.data.mappers.ProductMapper;
import com.example.ecommerce.data.repositories.ProductRepository;

public class CreateProductUseCaseImpl implements CreateProductUseCase{
    
    private final ProductRepository productRepository;

    public CreateProductUseCaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product execute(Product product){

        if(product.getPrice() <= 0){
            throw new BusinessException("O preço do produto deve ser maior que zero");
        }

        // boolean exists = productRepository.existsByName(product.getName());
        // if(exists){
        //     throw new BusinessException("Já existe um produto com esse nome");
        // }

        //product.validate();  IMPLEMENTAR ESSA VALIDAÇÃO

        var entity = ProductMapper.toEntity(product);

        var savedEntity = productRepository.save(entity);

        return ProductMapper.toDomain(savedEntity);
    }
};
