package com.epolTask.userList.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @NotNull
    @NotEmpty
    @Id
    private Long id;

    @NotNull
    @NotEmpty
    private String privilege;


    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public Role(String privilege) {
        this.privilege = privilege;
    }

    public Role(Long id, String privilege) {
        this.id = id;
        this.privilege = privilege;
    }

    public Long getIid() {
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", privilege='" + privilege + '\'' +
                '}';
    }
}
