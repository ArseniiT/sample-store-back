package com.example.sample3.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private String firstName;
    private String secondName;
    private LocalDate birthday;
    private String orderId;
    private String photoId;
}
