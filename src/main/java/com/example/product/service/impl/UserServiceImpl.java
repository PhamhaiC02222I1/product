package com.example.product.service.impl;

import com.example.product.model.User;
import com.example.product.repository.IUserRepository;
import com.example.product.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;
    public Optional<User> findByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
