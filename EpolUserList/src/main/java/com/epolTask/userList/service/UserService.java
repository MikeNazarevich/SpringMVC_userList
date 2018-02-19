package com.epolTask.userList.service;


import com.epolTask.userList.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void deleteUserById(Long id);
//    void findUserByName(String name);
}
