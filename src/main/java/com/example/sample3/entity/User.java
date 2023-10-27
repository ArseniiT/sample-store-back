package com.example.sample3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class User {

    @Id
    private String Id;
    private String firstName;
    private String secondName;
    private LocalDate birthday;
    private String orderId;
    private String photoId;
    private LocalDateTime createdAt;


}
