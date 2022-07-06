package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Page<Product> findAllByCategoryId(Long id, Pageable pageable);
Page<Product> findAll(Pageable pageable);
List<Product> findAll();
void deleteById(Long id);
Product save(Product product);
Optional<Product> findById(Long id);
}
