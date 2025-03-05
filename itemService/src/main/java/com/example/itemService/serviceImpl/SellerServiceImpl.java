package com.example.itemService.serviceImpl;

import com.example.itemService.entities.Location;
import com.example.itemService.entities.Seller;
import com.example.itemService.repositories.SellerRepository;
import com.example.itemService.services.SellerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    public static final Logger log = LoggerFactory.getLogger(SellerServiceImpl.class);

    @Autowired
    private SellerRepository sellerRepository;

  /*  @Override
    public Seller saveSeller(Seller seller) {
        // Ensure each location is linked to the seller before saving
        if (seller.getAvailableLocations() != null) {
            for (Location location : seller.getAvailableLocations()) {
                location.setSeller(seller);
            }
        }

        Seller seller1 = this.sellerRepository.save(seller);
        log.info("seller saved successfully with id {}",seller1.getSellerId());
        return seller1;
    }*/
  @Override
  public Seller saveSeller(Seller seller) {
      log.info("Saving seller: {}", seller);

      if (seller.getAvailableLocations() != null && !seller.getAvailableLocations().isEmpty()) {
          log.info("Seller has {} locations", seller.getAvailableLocations().size());

          for (Location location : seller.getAvailableLocations()) {
              log.info("Setting seller for location: {}", location);
              location.setSeller(seller);
          }
      } else {
          log.warn("Seller does not have any locations set");
      }

      Seller savedSeller = sellerRepository.save(seller);
      log.info("Seller saved successfully with id {}", savedSeller.getSellerId());
      return savedSeller;
  }

    @Override
    public Seller findSellerById(Long sellerId) {
        return null;
    }

    @Override
    public List<Seller> findAllSeller() {
        return List.of();
    }

    @Override
    public void deleteSellerById(Long sellerId) {

    }

    @Override
    public Seller findSellerBySellerName(String sellerName) {
        return null;
    }

    @Override
    public void updateSeller(Long sellerId, Seller seller) {

    }
}
