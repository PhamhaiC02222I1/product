package com.example.product.repository;


import com.example.product.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
    Boolean existsByNameCategory(String nameCategory);
    Page<Category> findAllByNameCategoryContaining(String nameCategory, Pageable pageable);
}
