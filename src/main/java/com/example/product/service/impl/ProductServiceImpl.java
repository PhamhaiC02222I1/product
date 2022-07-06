package com.example.product.service.impl;

import com.example.product.model.Product;
import com.example.product.model.User;
import com.example.product.repository.IProductRepository;
import com.example.product.security.userprincal.UserDetailService;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository productRepository;
    @Autowired
    UserDetailService userDetailService;
    public Page<Product> findAllByCategoryId(Long id, Pageable pageable) {
        return productRepository.findAllByCategoryId(id, pageable);
    }

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Long id) {
    productRepository.deleteById(id);
    }

    public Product save(Product product) {
        User user =userDetailService.getCurrentUser();
        product.setUser(user);
        return productRepository.save(product);
    }

    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }
}
