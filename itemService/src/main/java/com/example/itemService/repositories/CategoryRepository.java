package com.example.itemService.repositories;

import com.example.itemService.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    public Optional<Category> findCategoryByName(String categoryName);
}
