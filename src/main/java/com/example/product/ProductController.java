package com.example.product;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController()
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @PostMapping
   public Product createProduct(@RequestBody ProductRequest request){
        return productService.createProduct(request);
    }
    @GetMapping()
    public List<Product> getAllProducts(@RequestParam(required = false) String name,@RequestParam(required = false) String status){
        return  productService.getAllProduct(name,status);
    }
    @GetMapping("{productId}")
    public  Product getProduct(@PathVariable("productId") Integer id){
        return  productService.getProduct(id);
    }
    @PatchMapping("{productId}")
    public Product updateProduct(@PathVariable("productId") Integer id,@RequestBody ProductRequest request) {
        return productService.updateProduct(id, request);
    }
    @DeleteMapping("{productId}")
    public void deleteProduct(@PathVariable("productId") Integer id){
        productService.deleteProduct(id);
    }
}
