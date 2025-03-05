package com.example.itemService.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @NotNull(message = "Category name field should not be null.")
    @NotEmpty(message = "Category name field is required.")
    private String name;

    @NotEmpty(message = "Category description details are required")
    @Size(max = 500, message = " Description cannot exceed 500 characters")
    private String description;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JsonManagedReference(value = "category-product")
    @JsonIgnore
    private List<Product> product;

    public Category(Long categoryId, String description, String name) {
        this.categoryId = categoryId;
        this.description = description;
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public @NotNull(message = "Category name field should not be null.") @NotEmpty(message = "Category name field is required.") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "Category name field should not be null.") @NotEmpty(message = "Category name field is required.") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Category description details are required") @Size(max = 500, message = " Description cannot exceed 500 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty(message = "Category description details are required") @Size(max = 500, message = " Description cannot exceed 500 characters") String description) {
        this.description = description;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
