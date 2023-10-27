package com.example.sample3.repository;

import com.example.sample3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, String> {
}