package com.example.ecommerce.infra.database.h2;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.core.entities.Product;
import com.example.ecommerce.data.repositories.ProductRepository;

@Repository
public class H2ProductRepository implements ProductRepository{
    
    @Override
    public Product save(Product product){
        return null;
    }

    @Override
    public List<Product> findAll(){
        return null;
    }

    @Override
    public boolean existsByName(String name){
        return false;
    }
}
