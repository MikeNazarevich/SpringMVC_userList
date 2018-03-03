package com.epolTask.userList.controller;


import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
//@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

//    @Autowired
//    private SecurityService securityService;

    @GetMapping(value = "/kek")
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "list";
    }

    @GetMapping(value="/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/";
    }

    @GetMapping(value = "/login")
    public String login() {

        return "login";
    }

    @GetMapping(value = "/reg")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping(value = "/reg")
    public String registration(@Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.addUser(user);
        return "redirect:/login";
    }


}
