package com.example.UserManagement.dto;

import com.example.UserManagement.model.Sector;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class UserRegistrationRequest{
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sector sector;
    private String password;

}
