package com.epolTask.userList.controller;

import com.epolTask.userList.dto.CarBaseInfo;
import com.epolTask.userList.model.Car;
import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import com.epolTask.userList.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class CarController {

   @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/cars")
    @ResponseBody
    public List<CarBaseInfo> carList() {
        List<Car> cars = carService.getAllCars();
        List<CarBaseInfo> carBaseInfos = new ArrayList<>();

        for (Car car : cars)
            carBaseInfos.add(new CarBaseInfo(car));

       return carBaseInfos;
    }

    @PostMapping(value = "/{id}/add")
    public String getCars(@PathVariable("id") Long id) {
        userService.addCarToUser(id);
        return "redirect:/";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "{id}/car/delete")
    public void delete(@PathVariable("id") Long id) {

        carService.deleteCarById(id);
    }
}
