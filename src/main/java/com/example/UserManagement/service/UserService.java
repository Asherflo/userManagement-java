package com.example.UserManagement.service;

import com.example.UserManagement.dto.UserDto;
import com.example.UserManagement.dto.UserRegistrationRequest;
import com.example.UserManagement.model.User;

import java.util.Optional;

public interface UserService {
     UserDto registerUser(UserRegistrationRequest UserRegistrationRequest);
     Optional<User> findUserById(Long id);

     User updateUser(Long id,User updatedUser);

}
