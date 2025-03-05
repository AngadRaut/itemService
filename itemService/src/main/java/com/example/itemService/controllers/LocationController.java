package com.example.itemService.controllers;

import com.example.itemService.entities.Location;
import com.example.itemService.entities.Seller;
import com.example.itemService.services.LocationService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Binding;
import java.util.Map;

@RestController
@RequestMapping("/api/location")
public class LocationController {
   public static final Logger log = LoggerFactory.getLogger(LocationController.class);

   @Autowired
   private LocationService locationService;

   @PostMapping("/add")
    public ResponseEntity<?> addLocation(@Valid @RequestBody Location location , BindingResult bindingResult){
       log.info("Received request to add location...");
       // Validate the input
       if (bindingResult.hasErrors()) {
           log.warn("Validation failed for location request: {}", bindingResult.getAllErrors());
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid input.", "errors", bindingResult.getAllErrors()).toString());
       }
       Location location1 = this.locationService.saveLocation(location);
       log.info("Location successfully added in records locationId:{}",location1.getLocationId());
//        return ResponseEntity.status(HttpStatus.CREATED).body("Category added successfully, categoryId:"+category1.getCategoryId());
       return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
               "message", "Location added successfully.",
               "locationId", location1.getLocationId()
       ));
    }
}