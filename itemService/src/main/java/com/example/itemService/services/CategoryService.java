package com.example.itemService.services;

import com.example.itemService.entities.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);
    public Category findCategoryById(Long categoryId);
    public List<Category> findAllCategory();
    public void deleteCategoryById(Long categoryId);
    public Category findCategoryByName(String categoryName);
    public void updateCategory(Long categoryId,Category categoryName);
}
