package com.example.service;

import com.example.model.User;

import java.util.List;

public interface IUserService{

    User getUserById(Long userId);
    User update(User user);
    List<User> getAllUsers();
    User delete(Long id);
    User create(User user);

}