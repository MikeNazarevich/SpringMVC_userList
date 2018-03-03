package com.epolTask.userList.service;

import com.epolTask.userList.model.Car;
import com.epolTask.userList.repository.CarRepository;
import com.epolTask.userList.service.api.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.delete(id);
    }
}
