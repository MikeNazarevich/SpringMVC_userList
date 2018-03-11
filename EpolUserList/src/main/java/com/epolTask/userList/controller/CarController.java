package com.epolTask.userList.controller;

import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import com.epolTask.userList.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CarController {

   @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/cars")
    public String carList(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

    @GetMapping(value = "/{id}/add")
    public String getCars(@PathVariable("id") Long id) {
        userService.addCarToUser(id);
        return "redirect:/";
    }

    @GetMapping(value = "{id}/car/delete")
    public String delete(@PathVariable("id") Long id) {
        carService.deleteCarById(id);
        return "redirect:/cars";
    }
}
