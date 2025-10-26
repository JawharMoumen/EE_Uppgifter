package com.uppgift.java_lektion_3.Service;

import com.uppgift.java_lektion_3.Product;
import com.uppgift.java_lektion_3.Repository.ProductRepository;
import com.uppgift.java_lektion_3.Exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findByName(String name) {
        return productRepository.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException(name));
    }
}
