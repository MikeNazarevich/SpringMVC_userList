package com.epolTask.userList.controller;

import com.epolTask.userList.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("list");
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String registrForm(ModelAndView model, User user) {
//        model.addObject("register", user);
        return "registerPage";
    }
}
