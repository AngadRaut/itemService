package com.example.itemService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @NotNull(message = "Country field should not be null.")
    @NotEmpty(message = "Country field is required.")
    @Size(max = 100, message = "Country name cannot exceed 100 characters.")
    private String country;

    @NotNull(message = "District field should not be null.")
    @NotEmpty(message = "District field is required.")
    @Size(max = 100, message = "District name cannot exceed 100 characters.")
    private String district;

    @NotNull(message = "Pin code is required.")
    @Pattern(regexp = "\\d{6}", message = "Pin code must be exactly 6 digits.")
    private String pinCode;

    // manytoone
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    @JsonBackReference
    private Seller seller;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public @NotNull(message = "Country field should not be null.") @NotEmpty(message = "Country field is required.") @Size(max = 100, message = "Country name cannot exceed 100 characters.") String getCountry() {
        return country;
    }

    public void setCountry(@NotNull(message = "Country field should not be null.") @NotEmpty(message = "Country field is required.") @Size(max = 100, message = "Country name cannot exceed 100 characters.") String country) {
        this.country = country;
    }

    public @NotNull(message = "District field should not be null.") @NotEmpty(message = "District field is required.") @Size(max = 100, message = "District name cannot exceed 100 characters.") String getDistrict() {
        return district;
    }

    public void setDistrict(@NotNull(message = "District field should not be null.") @NotEmpty(message = "District field is required.") @Size(max = 100, message = "District name cannot exceed 100 characters.") String district) {
        this.district = district;
    }

    public @NotNull(message = "Pin code is required.") @Pattern(regexp = "\\d{6}", message = "Pin code must be exactly 6 digits.") String getPinCode() {
        return pinCode;
    }

    public void setPinCode(@NotNull(message = "Pin code is required.") @Pattern(regexp = "\\d{6}", message = "Pin code must be exactly 6 digits.") String pinCode) {
        this.pinCode = pinCode;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}