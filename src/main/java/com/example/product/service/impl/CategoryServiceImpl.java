package com.example.product.service.impl;

import com.example.product.model.Category;
import com.example.product.model.User;
import com.example.product.repository.ICategoryRepository;
import com.example.product.security.userprincal.UserDetailService;
import com.example.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;
    @Autowired
    UserDetailService userDetailService;
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    public Category save(Category category) {
        User user=userDetailService.getCurrentUser();
        category.setUser(user);
        return categoryRepository.save(category);
    }

    public void deleteById(Long id) {
categoryRepository.deleteById(id);
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public Boolean existsByNameCategory(String nameCategory) {
        return categoryRepository.existsByNameCategory(nameCategory);
    }

    public Page<Category> findAllByNameCategoryContaining(String nameCategory, Pageable pageable) {
        return categoryRepository.findAllByNameCategoryContaining(nameCategory,pageable);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
