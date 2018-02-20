package com.epolTask.userList.model;

public class Role {
    private Long id;
    private String privilege;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", privilege='" + privilege + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Role(Long id, String privilege) {

        this.id = id;
        this.privilege = privilege;
    }
}
