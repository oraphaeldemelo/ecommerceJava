package com.example.ecommerce.infrastructure.product.dto;

import com.example.ecommerce.usecase.product.dto.ICreateProductDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateProductDto(
    @NotBlank
    String name,

    @NotNull
    Double price) implements ICreateProductDTO{

}
