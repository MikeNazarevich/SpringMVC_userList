package com.epolTask.userList.UserService;

import com.epolTask.userList.UserDao.UserDao;
import com.epolTask.userList.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List getAllUsers() {
        return userDao.getAllUsers();
    }

    public void delete(String id) {
        userDao.delete(id);
    }
}
