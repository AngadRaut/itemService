package com.example.itemService.controllers;

import com.example.itemService.entities.Seller;
import com.example.itemService.services.SellerService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/seller")
public class SellerController {
    public static final Logger log = LoggerFactory.getLogger(SellerController.class);

    @Autowired
    private SellerService sellerService;

    @PostMapping(value = "/add",consumes = {"application/json", "application/json;charset=UTF-8"})
    public ResponseEntity<?> addSeller(@Valid @RequestBody Seller seller, BindingResult bindingResult){
        log.info("Received request to add seller...");
        // Validate the input

        Seller seller1=null;
        try {
            if (bindingResult.hasErrors()) {
                log.warn("Validation failed for seller request: {}", bindingResult.getAllErrors());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid input.", "errors", bindingResult.getAllErrors()).toString());
            }
             seller1 = this.sellerService.saveSeller(seller);
            log.info("Seller successfully added in records sellerId:{}",seller1.getSellerId());
//        return ResponseEntity.status(HttpStatus.CREATED).body("Category added successfully, categoryId:"+category1.getCategoryId());

        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "message", "Seller added successfully.",
                "sellerId", seller1.getSellerId()
        ));
    }
}
