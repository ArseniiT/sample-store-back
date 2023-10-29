package com.example.sample3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_", schema = "public")
@Data
@Accessors(chain = true)
public class User {

    @Id
    private String Id;
    private String firstName;
    private String secondName;
    private LocalDate birthday;
    private String orderId;
    private String photoId;
    private LocalDateTime createdAt;

//  replaced by @Accessors(chain = true)
//    public User setFirstName(String name) {
//        return this;
//    }
}
