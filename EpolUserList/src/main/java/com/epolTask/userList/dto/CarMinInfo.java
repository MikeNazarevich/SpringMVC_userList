package com.epolTask.userList.dto;

import com.epolTask.userList.model.Car;

public class CarMinInfo {

    private String name;

    private String photo;

    public CarMinInfo(Car car) {
        name = car.getName();
        photo = car.getPhoto();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
