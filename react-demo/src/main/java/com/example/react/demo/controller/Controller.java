package com.example.react.demo.controller;

import com.example.react.demo.UserClass;
import com.example.react.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/create")
    public String createUser(@RequestBody UserClass userClass) {
        service.createUser(userClass);
        return "User was created successfully";
    }

    @GetMapping("/all")
    public List<UserClass> getAllUser() {
        return service.getAllUser();
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        service.deleteUserById(id);
        return "User deleted successfully";
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserClass updatedUser) {
        UserClass user = service.updateUser(id, updatedUser);
        if (user != null) {
            return "User updated successfully";
        }
        return "User not found";
    }



}
