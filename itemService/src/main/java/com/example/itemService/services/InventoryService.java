package com.example.itemService.services;

import com.example.itemService.entities.Inventory;

import java.util.List;

public interface InventoryService {
    public Inventory saveInventory(Inventory inventory);
    public Inventory findInventoryById(Long inventoryId);
    public List<Inventory> findAllInventory();
    public void deleteInventoryById(Long inventoryId);
    public void updateInventory(Long inventoryId);
}
