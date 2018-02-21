package com.epolTask.userList.dao;

import com.epolTask.userList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
//    void deleteUserById(Long id);
//    List<User> getAllUsers();
//    User findUserByName(String name);
}
