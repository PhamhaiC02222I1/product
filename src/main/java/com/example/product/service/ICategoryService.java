package com.example.product.service;


import com.example.product.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);
    Category save(Category category);
    void deleteById(Long id);
    Optional<Category> findById(Long id);
    Boolean existsByNameCategory(String nameCategory);
    Page<Category> findAllByNameCategoryContaining(String nameCategory, Pageable pageable);
    List<Category> findAll();
}