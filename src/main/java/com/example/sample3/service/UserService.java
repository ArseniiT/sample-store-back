package com.example.sample3.service;

import com.example.sample3.dto.UserDto;
import com.example.sample3.entity.User;
import com.example.sample3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

// replaced by @RequiredArgsConstructor
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public User save(UserDto userDto) {
        User user =  new User()
                .setFirstName(userDto.getFirstName())
                .setBirthday(userDto.getBirthday())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

    // FIXME remake findAll with using Pageable
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
