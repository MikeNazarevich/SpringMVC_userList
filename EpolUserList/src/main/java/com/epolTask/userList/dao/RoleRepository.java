package com.epolTask.userList.dao;

import com.epolTask.userList.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
