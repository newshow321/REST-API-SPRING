package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category createUpdateCategory(Category category) {
        return categoryRepository.save(category);
    }
}
