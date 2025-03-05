package com.example.itemService.services;

import com.example.itemService.entities.Category;
import com.example.itemService.entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LocationService {
    public Location saveLocation(Location location);
    public Location findLocationById(Long locationId);
    public List<Location> findAllLocation();
    public void deleteLocationById(Long locationId);
    public void updateLocation(Long locationId);
}