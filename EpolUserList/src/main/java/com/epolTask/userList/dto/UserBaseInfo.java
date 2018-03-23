package com.epolTask.userList.dto;

import com.epolTask.userList.model.User;

public class UserBaseInfo {

    private Long id;

    private String username;

    public UserBaseInfo(User user) {
        id = user.getId();
        username = user.getUsername();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
