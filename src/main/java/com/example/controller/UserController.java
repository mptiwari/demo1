package com.example.controller;


import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        User user1 = userService.create(user);
        return user1;

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = {"/{id}"})
    public User getUserById(@PathVariable("id") Long userId) {

        User user = userService.getUserById(userId);
        return user;
    }


    @PutMapping
    public User update(@RequestBody User user) {

        System.out.println("userId coming to update ------------" + user.getUserId());
        return userService.update(user);
    }

    @DeleteMapping(path = {"/{id}"})
    public User delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}