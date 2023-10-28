package com.example.sample3.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private String firstName;
    private LocalDate birthday;
}
