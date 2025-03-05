package com.example.itemService.repositories;

import com.example.itemService.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {
    public Optional<Seller> findSellerBySellerName(String sellerName);
}
