package com.example.ecommerce.infrastructure.config.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.infrastructure.config.db.schema.ProductSchema;

public interface ProductRepository extends JpaRepository<ProductSchema, Long> {
    
}
