package com.epolTask.userList.service;


import com.epolTask.userList.dto.UserBaseInfo;
import com.epolTask.userList.dto.UserRegInfo;
import com.epolTask.userList.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void deleteUserById(Long id);

    User addUser(UserRegInfo user);

    User findByUsername(String username);

    void addCarToUser(Long id);

    User getLoggedInUser();
}
