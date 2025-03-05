package com.example.itemService.controllers;

import com.example.itemService.entities.Category;
import com.example.itemService.serviceImpl.CategoryServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryServiceImpl categoryService;

    // add category
    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@Valid @RequestBody Category category, BindingResult bindingResult){
        log.info("Received request to add category.");
        // Validate the input
        if (bindingResult.hasErrors()) {
            log.warn("Validation failed for category request: {}", bindingResult.getAllErrors());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid input.", "errors", bindingResult.getAllErrors()).toString());
        }
        Category category1 = this.categoryService.saveCategory(category);
        log.info("Category successfully added in records categoryId:{}",category1.getCategoryId());
//        return ResponseEntity.status(HttpStatus.CREATED).body("Category added successfully, categoryId:"+category1.getCategoryId());
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "message", "Category added successfully.",
                "categoryId", category1.getCategoryId()
        ));
    }
}