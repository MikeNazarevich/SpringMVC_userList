package com.epolTask.userList.controller;


import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.allUsers();
    }

    @GetMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("users", userService.allUsers());
        return "list";
    }

    @GetMapping(value="/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/list";
    }



//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String add(@RequestParam("id") int id,
//                      @RequestParam("name") String name,
//                      @RequestParam("surname") String surname) {
//        userService.addUser(id, name, surname);
//        return "redirect:/all";
//    }
}
