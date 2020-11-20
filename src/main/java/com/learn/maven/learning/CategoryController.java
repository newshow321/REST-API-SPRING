package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/category") // Get All Data
    public Map<String, Object> getAll() {
        Map<String, Object> m = new HashMap<>();
        m.put("status", Boolean.TRUE);
        m.put("message", "Data Successfully loaded.");
        m.put("data", categoryService.categoryRepository.findAll());
        return m;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/category/{id}") // Get By Id
    public Map<String, Object> getById(@PathVariable("id") Integer id) {
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully loaded.");
        data.put("data", categoryService.categoryRepository.findAllById(id));
        return data;
    }

    @PostMapping("/createUpdateCategory") // Create Or Update
    public ResponseEntity<Category> createUpdate(@RequestBody Category category) {
        categoryService.createUpdateCategory(category);
        return new ResponseEntity<Category>(category, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/doDeleteCategory/{id}") // Delete
    public Map<String, Object> deleteCustomer(@PathVariable("id") Integer id){
        Category dataCategory = categoryService.categoryRepository.findAllById(id);
        categoryService.categoryRepository.delete(dataCategory);
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully deleted.");
        data.put("data", dataCategory);
        return data;
    }
}
