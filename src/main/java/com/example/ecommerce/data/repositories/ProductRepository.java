package com.example.ecommerce.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.data.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    
}
