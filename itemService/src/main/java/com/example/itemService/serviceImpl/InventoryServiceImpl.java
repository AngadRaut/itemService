package com.example.itemService.serviceImpl;

import com.example.itemService.entities.Inventory;
import com.example.itemService.services.InventoryService;

import java.util.List;

public class InventoryServiceImpl implements InventoryService {
    @Override
    public Inventory saveInventory(Inventory inventory) {
        return null;
    }

    @Override
    public Inventory findInventoryById(Long inventoryId) {
        return null;
    }

    @Override
    public List<Inventory> findAllInventory() {
        return List.of();
    }

    @Override
    public void deleteInventoryById(Long inventoryId) {

    }

    @Override
    public void updateInventory(Long inventoryId) {

    }
}
