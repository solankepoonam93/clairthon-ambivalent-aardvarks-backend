package com.cv.srm.service;

import com.cv.srm.model.User;

import java.util.List;

public interface UserService {
    User add(User user);
    List<User> getAllUsers();
}
