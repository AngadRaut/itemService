package com.example.itemService.services;

import com.example.itemService.entities.Seller;

import java.util.List;

public interface SellerService {
    public Seller saveSeller(Seller seller);
    public Seller findSellerById(Long sellerId);
    public List<Seller> findAllSeller();
    public void deleteSellerById(Long sellerId);
    public Seller findSellerBySellerName(String sellerName);
    public void updateSeller(Long sellerId,Seller seller);
}
