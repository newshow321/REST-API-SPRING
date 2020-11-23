package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product createUpdateProduct(Product product) {
        return productRepository.save(product);
    }
}
