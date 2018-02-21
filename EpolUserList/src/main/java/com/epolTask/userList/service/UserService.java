package com.epolTask.userList.service;


import com.epolTask.userList.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void deleteUserById(Long id);
    public void createUser(User user);
//    void findUserByName(String name);
}
