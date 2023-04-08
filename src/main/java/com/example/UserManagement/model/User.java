package com.example.UserManagement.model;

import jakarta.persistence.*;
import lombok.*;
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String userName;
    private String email;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sector sector;
    private String password;



}