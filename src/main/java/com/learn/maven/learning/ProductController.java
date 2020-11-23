package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/products") // Get All Data
    public Map<String, Object> getAll() {
        Map<String, Object> m = new HashMap<>();
        m.put("status", Boolean.TRUE);
        m.put("message", "Data Successfully loaded.");
        m.put("data", productService.productRepository.findAll());
        return m;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/products/{id}") // Get By Id
    public Map<String, Object> getById(@PathVariable("id") Long id) {
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully loaded.");
        data.put("data", productService.productRepository.findAllById(id));
        return data;
    }

    @PostMapping("/createUpdateProducts") // Create Or Update
    public ResponseEntity<Product> createUpdate(@RequestBody Product product) {
        productService.createUpdateProduct(product);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/doDeleteProducts/{id}") // Delete
    public Map<String, Object> deleteProduct(@PathVariable("id") Long id){
        Product dataProduct = productService.productRepository.findAllById(id);
        productService.productRepository.delete(dataProduct);
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully deleted.");
        data.put("data", dataProduct);
        return data;
    }
}
