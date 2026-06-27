package com.example.smarthiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.smarthiring.dto.UserRequestDto;
import com.example.smarthiring.entity.User;
import com.example.smarthiring.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserRequestDto request) {
        return userService.registerUser(request);
    }
}