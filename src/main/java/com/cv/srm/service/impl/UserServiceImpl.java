package com.cv.srm.service.impl;

import com.cv.srm.model.User;
import com.cv.srm.repository.UserRepository;
import com.cv.srm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(User user) {
        // logic to create UserRnrDetail blank snapshot
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

