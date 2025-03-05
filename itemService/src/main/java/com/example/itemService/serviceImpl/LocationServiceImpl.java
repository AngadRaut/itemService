package com.example.itemService.serviceImpl;

import com.example.itemService.entities.Location;
import com.example.itemService.repositories.LocationRepository;
import com.example.itemService.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return this.locationRepository.save(location);
    }

    @Override
    public Location findLocationById(Long locationId) {
        return null;
    }

    @Override
    public List<Location> findAllLocation() {
        return List.of();
    }

    @Override
    public void deleteLocationById(Long locationId) {

    }

    @Override
    public void updateLocation(Long locationId) {

    }
}
