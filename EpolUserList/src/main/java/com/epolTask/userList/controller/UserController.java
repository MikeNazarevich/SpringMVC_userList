package com.epolTask.userList.controller;


import com.epolTask.userList.dto.UserDetailInfo;
import com.epolTask.userList.model.Role;
import com.epolTask.userList.model.User;
import com.epolTask.userList.service.CarService;
import com.epolTask.userList.service.SecurityService;
import com.epolTask.userList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("user", new UserDetailInfo(userService.getLoggedInUser()));
        model.addAttribute("users", userService.getAllUsers());
        return "list";
    }

    @GetMapping(value="/{id}/user/delete")
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

        System.out.println(userService.findByUsername(user.getUsername()));
        if (userService.findByUsername(user.getUsername()) != null)
            return "redirect:/reg";

        else {
            userService.addUser(user);
            return "redirect:/login";
        }
    }

    @GetMapping(value = "/{username}/user/detail_info")
    public String detailInfo(Model model, @PathVariable("username") String username) {
        model.addAttribute("user", new UserDetailInfo(userService.findByUsername(username)));
        return "UserInfo";
    }





}
