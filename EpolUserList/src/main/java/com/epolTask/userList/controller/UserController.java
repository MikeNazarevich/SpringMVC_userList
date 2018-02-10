package com.epolTask.userList.controller;

import com.epolTask.userList.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private  UserService userService;

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ModelAndView listUser() {
        ModelAndView map = new ModelAndView("users-page");
        map.addObject("users", userService.getAllUsers());
        return map;
    }

    @RequestMapping(value="/{id}/delete", method = RequestMethod.GET)
    public String delUser(@PathVariable("id") String id) {
        userService.delete(id);
        System.out.println(id);
        return "redirect:/users/all";
    }

}
