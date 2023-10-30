package com.example.sample3.controller;

import com.example.sample3.dto.UserDto;
import com.example.sample3.entity.User;
import com.example.sample3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User save(@RequestBody UserDto user) {
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> getAll() {
        return userService.getAll();
    }

}
