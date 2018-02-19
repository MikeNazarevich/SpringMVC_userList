package com.epolTask.userList.dao;

import com.epolTask.userList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
    public void deleteUserById(Long id);
    User findUserByName(String name);
}
