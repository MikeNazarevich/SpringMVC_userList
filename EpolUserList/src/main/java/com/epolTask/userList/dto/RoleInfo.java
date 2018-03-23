package com.epolTask.userList.dto;

import com.epolTask.userList.model.Role;

public class RoleInfo {

    private String privilege;

    public RoleInfo(Role role) {
        privilege = role.getPrivilege();
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
}
