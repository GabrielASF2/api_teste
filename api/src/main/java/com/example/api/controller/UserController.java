package com.example.api.controller;

import com.example.api.entity.UserEntity;
import com.example.api.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public UserEntity newUser(@RequestBody UserEntity user) {
        return userService.newUser(user);
    }

    @PutMapping("/user")
    public UserEntity editUser(@RequestBody UserEntity user) {
        return userService.editUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void delUser(@PathVariable Long id) {
        userService.delUser(id);
    }
}
