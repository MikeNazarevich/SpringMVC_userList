package com.epolTask.userList.userService;

import com.epolTask.userList.userDao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;

    public List getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    public void delete(String id) {
        userDaoImpl.delete(id);
    }
}
