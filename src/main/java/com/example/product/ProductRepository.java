package com.example.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByStatus(String status);
    List <Product>  findByNameContainingIgnoreCaseAndStatus(String name, String status);
}
