package com.epolTask.userList.repository;

import com.epolTask.userList.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByPrivilege(String privelege);
}
