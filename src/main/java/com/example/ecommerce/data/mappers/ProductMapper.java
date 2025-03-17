package com.example.ecommerce.data.mappers;

import com.example.ecommerce.core.entities.Product;
import com.example.ecommerce.data.entities.ProductEntity;

public class ProductMapper {
    
    public static Product toDomain(ProductEntity entity){
        return new Product(entity.getId(), entity.getName(), entity.getPrice());
    }

    public static ProductEntity toEntity(Product domain){
        ProductEntity entity = new ProductEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        entity.setPrice(domain.getPrice());
        return entity;
    }
}
