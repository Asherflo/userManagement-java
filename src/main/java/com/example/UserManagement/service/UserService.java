package com.example.UserManagement.service;

import com.example.UserManagement.dto.UserDto;
import com.example.UserManagement.dto.UserRegistrationRequest;
import com.example.UserManagement.model.User;

public interface UserService {
     UserDto registerUser(UserRegistrationRequest UserRegistrationRequest);
       UserDto findUserById(Long id);
}
