package com.example.inventory_management.dtos;

public record  ProductRequest (
        String name,
        Integer quantity,
        Double price,
        String status
){}

