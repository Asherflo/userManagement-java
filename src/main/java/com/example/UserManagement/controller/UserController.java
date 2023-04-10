package com.example.UserManagement.controller;

import com.example.UserManagement.dto.UserDto;
import com.example.UserManagement.dto.UserRegistrationRequest;
import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/userApp")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequest userRegistrationRequest){
        UserDto userDto =userService.registerUser(userRegistrationRequest);
        return  new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }
    @GetMapping("/users/{id}")
    public  ResponseEntity<?> getUser(@PathVariable("id")Long id ){
        Optional<User> user = userService.findUserById(id);
        return new  ResponseEntity<>(user,HttpStatus.OK);
    }

}
