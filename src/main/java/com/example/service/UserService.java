package com.example.service;


import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) {

        return userRepository.save(user);
    }


    @Override
    public User getUserById(Long userId) {

        return userRepository.getOne(userId);
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        System.out.println("coming to service for update" + user.getEmail());
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id) {
        User user = getUserById(id);
        if (user != null) {
            userRepository.delete(user);
        }
        return user;
    }


}