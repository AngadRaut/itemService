package com.example.itemService.services;

import com.example.itemService.entities.Category;
import com.example.itemService.entities.Product;

import java.util.List;

public interface ProductService {
    public Product saveCategory(Product product);
    public Product findProductByProductId(Long productId);
    public List<Product> findAllProduct();
    public void deleteProductByProductId(Long productId);
    public Product findProductByProductName(String productName);
    public void updateProduct(Long productId,Product productName);
}