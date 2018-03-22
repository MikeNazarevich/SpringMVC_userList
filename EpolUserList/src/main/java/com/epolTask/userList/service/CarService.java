package com.epolTask.userList.service;

import com.epolTask.userList.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    void deleteCarById(Long id);

    Car addCar(Long id);
}
