package com.example.itemService.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Long inventoryId ;

   // private seller Seller
    private Integer stockQuantity ;
    private Integer soldQuantity;
    private String warehouseLocation;

    @OneToMany(mappedBy = "inventory",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Product> products;

    public Inventory(Long inventoryId, Integer stockQuantity, Integer soldQuantity, String warehouseLocation) {
        this.inventoryId = inventoryId;
        this.stockQuantity = stockQuantity;
        this.soldQuantity = soldQuantity;
        this.warehouseLocation = warehouseLocation;
    }
}