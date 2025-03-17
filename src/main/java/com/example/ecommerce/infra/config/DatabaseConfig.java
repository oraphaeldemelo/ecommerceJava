package com.example.ecommerce.infra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ecommerce.data.repositories.ProductRepository;
import com.example.ecommerce.infra.database.h2.H2ProductRepository;
import com.example.ecommerce.infra.database.mongo.MongoProductRepository;
import com.example.ecommerce.infra.database.postgres.PostgresProductRepository;

@Configuration
public class DatabaseConfig {
    
    @Value("${db.type}")
    private String databaseType;

    @Bean
    public ProductRepository productRepository(){
        switch(databaseType.toLowerCase()){
            case "h2":
                return new H2ProductRepository();
            case "postgres":
                return new PostgresProductRepository();
            case "mongo":
                return new MongoProductRepository();
            default:
            throw new IllegalArgumentException("Unsupported database type: " + databaseType);
        }
    }    
}
