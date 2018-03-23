package com.epolTask.userList.dto;

import com.epolTask.userList.model.Car;

public class CarBaseInfo {

    private Long id;

    private String name;

    private String photo;

    public CarBaseInfo(Car car) {
        id = car.getId();
        name = car.getName();
        photo = car.getPhoto();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
