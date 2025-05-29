package com.example.ecommerce.infrastructure.config.db.schema;

import com.example.ecommerce.entity.product.model.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class ProductSchema extends AbstractEntitySchema<Long> {
    
    @NotBlank
    @Column(length = 30)
    private String name;

    @NotNull
    @Column(nullable = false, length = 5)
    private Double price;

    public ProductSchema(Product product){
        this.name = product.getName();
        this.price = product.getPrice();
    }
    public ProductSchema() {
        super();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    

    public Product toProduct() {
        Product product = new Product(this.name, this.price);
        product.setId(this.getId());
        return product;
    }
}
