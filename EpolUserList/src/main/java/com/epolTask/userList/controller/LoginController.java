package com.epolTask.userList.controller;

import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {
    private UserService userService;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("list");
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String showForm(User user) {
        return "registerPage";
    }

    @PostMapping(value = "/register")
    public String checkInfo(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "registerPage";
        userService.createUser(user);

        return "login";
    }
}
