package com.uppgift.java_lektion_3.Controller;

import com.uppgift.java_lektion_3.Product;
import com.uppgift.java_lektion_3.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @GetMapping("/search")
    public ResponseEntity<Product> getProduct(@RequestParam String name) {
        Product product = productService.findByName(name);
        return ResponseEntity.ok(product);
    }

}
