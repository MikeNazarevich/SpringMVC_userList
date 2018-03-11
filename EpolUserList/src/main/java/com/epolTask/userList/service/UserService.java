package com.epolTask.userList.service;


import com.epolTask.userList.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void deleteUserById(Long id);

    void addUser(User user);

    User findByUsername(String username);

    void addCarToUser(Long id);
}
