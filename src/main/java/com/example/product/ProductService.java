package com.example.product;

import org.springframework.stereotype.Service;
import  java.util.List;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public Product createProduct( ProductRequest request){
        Product product=new Product();
        product.setName(request.name());
        product.setPrice(request.price());
        product.setQuantity(request.quantity());
        product.setStatus(request.status());
        productRepository.save(product);
        return  product;
    }
    public List<Product> getAllProduct(String name, String status){
        if(name !=null && status !=null){
            return  productRepository.findByNameContainingIgnoreCaseAndStatus(name,status);
        }else if(name != null){
            return productRepository.findByNameContainingIgnoreCase(name);
        } else if (status != null) {
            return productRepository.findByStatus(status);
        }else{
            return productRepository.findAll();
        }

    }
    public Product getProduct(Integer id){
       return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));

    }
    public Product updateProduct(Integer id, ProductRequest request){
        Product product=productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        if(request.name() != null){
            product.setName(request.name());
        }
       if(request.price() != null) {
           product.setPrice(request.price());
       }
       if (request.quantity() != null) product.setQuantity(request.quantity());
      if(request.quantity() != null && request.quantity() ==0){
          product.setStatus("Not available");
      }else if (request.status() != null){
            product.setStatus(request.status());
        }
        return productRepository.save(product);

        }
        public void deleteProduct(Integer id){
        productRepository.deleteById(id);
        }
    }

