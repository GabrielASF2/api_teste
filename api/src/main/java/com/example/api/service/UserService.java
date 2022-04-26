package com.example.api.service;

import com.example.api.entity.UserEntity;
import com.example.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
       return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.getById(id);
    }

    public UserEntity newUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity editUser(UserEntity user) {
        return userRepository.save(user);
    }

    public void delUser(Long id) {
        userRepository.deleteById(id);
    }
}
