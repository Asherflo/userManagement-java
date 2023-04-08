package com.example.UserManagement.service;

import com.example.UserManagement.dto.UserDto;
import com.example.UserManagement.dto.UserRegistrationRequest;
import com.example.UserManagement.model.User;
import com.example.UserManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl  implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto registerUser(UserRegistrationRequest userRegistrationRequest) {
        User user = User.builder()
                .age(userRegistrationRequest.getAge())
                .firstName(userRegistrationRequest.getFirstName())
                .lastName(userRegistrationRequest.getLastName())
                .userName(userRegistrationRequest.getUserName())
                .email(userRegistrationRequest.getEmail())
                .password(userRegistrationRequest.getPassword())
                .sector(userRegistrationRequest.getSector())
                .build();
        User savedUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setUser(savedUser);
        userDto.setMessage(" You're,Welcome!".concat(userRegistrationRequest.getUserName()));
        return userDto;
    }

    @Override
    public UserDto findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            UserDto userDto = new UserDto();
            userDto.setMessage("User found!!");
            userDto.getUser();
            return userDto;
        }
        return null;
    }
}
