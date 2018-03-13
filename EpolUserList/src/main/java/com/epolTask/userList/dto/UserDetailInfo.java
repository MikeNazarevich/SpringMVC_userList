package com.epolTask.userList.dto;

import com.epolTask.userList.model.Car;
import com.epolTask.userList.model.Role;
import com.epolTask.userList.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDetailInfo {

    private Long userId;

    private String name;

    private String surname;

    private String username;

    private List<Car> cars = new ArrayList<>();

    private List<Role> roles = new ArrayList<>();

    private Boolean isAdmin;

    public UserDetailInfo(User user) {
        userId = user.getId();
        name = user.getName();
        surname = user.getSurname();
        username = user.getUsername();

        for (Car car : user.getCars())
            cars.add(car);

        for (Role role : user.getRoles()) {
            if (role.getPrivilege().compareTo("ADMIN") == 0)
                isAdmin = true;
        }
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
