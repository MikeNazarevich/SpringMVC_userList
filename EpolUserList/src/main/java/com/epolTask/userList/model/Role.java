package com.epolTask.userList.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    public Role() {
    }

    public Role(Long id, String privilege) {
        this.id = id;
        this.privilege = privilege;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", privilege='" + privilege + '\'' +
                '}';
    }
}
