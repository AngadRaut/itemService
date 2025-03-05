package com.example.itemService.serviceImpl;

import com.example.itemService.entities.Category;
import com.example.itemService.repositories.CategoryRepository;
import com.example.itemService.services.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    public static final Logger log = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        Category save = this.categoryRepository.save(category);
        log.info("category saved successfully {}",save.getCategoryId());
        return save;
    }

    @Override
    public Category findCategoryById(Long categoryId) {
        return null;
    }

    @Override
    public List<Category> findAllCategory() {
        return List.of();
    }

    @Override
    public void deleteCategoryById(Long categoryId) {

    }

    @Override
    public Category findCategoryByName(String categoryName) {
        return null;
    }

    @Override
    public void updateCategory(Long categoryId, Category categoryName) {

    }
}
