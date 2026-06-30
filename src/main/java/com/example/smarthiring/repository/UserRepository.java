package com.example.smarthiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smarthiring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    User findByEmail(String email);
}