package com.example.itemService.serviceImpl;

import com.example.itemService.entities.Product;
import com.example.itemService.services.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product saveCategory(Product product) {
        return null;
    }

    @Override
    public Product findProductByProductId(Long productId) {
        return null;
    }

    @Override
    public List<Product> findAllProduct() {
        return List.of();
    }

    @Override
    public void deleteProductByProductId(Long productId) {

    }

    @Override
    public Product findProductByProductName(String productName) {
        return null;
    }

    @Override
    public void updateProduct(Long productId, Product productName) {

    }
}
