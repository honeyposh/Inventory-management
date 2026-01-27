package com.example.product;

public record  ProductRequest (
        String name,
        Integer quantity,
        Double price,
        String status
){}

