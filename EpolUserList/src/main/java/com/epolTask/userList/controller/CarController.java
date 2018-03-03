package com.epolTask.userList.controller;

import com.epolTask.userList.service.api.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carList(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }
//
//    @PostMapping(value = "/cars")
//    public String getCars(@Valid  )
}
