package com.epolTask.userList.controller;


import com.epolTask.userList.dto.UserBaseInfo;
import com.epolTask.userList.dto.UserDetailInfo;
import com.epolTask.userList.dto.UserFullInfo;
import com.epolTask.userList.dto.UserRegInfo;
import com.epolTask.userList.model.User;
import com.epolTask.userList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    @ResponseBody
    public List<UserBaseInfo> list() {

        List<User> users = userService.getAllUsers();
        List<UserBaseInfo> userBaseInfo = new ArrayList<>();

        for (User user : users)
            userBaseInfo.add(new UserBaseInfo(user));

        return userBaseInfo;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value="/{id}/user/delete")
    public void delete(@PathVariable("id") Long id) {

        userService.deleteUserById(id);
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }


    @PostMapping(value = "/reg")
    @ResponseBody
    public UserFullInfo registration(@RequestBody UserRegInfo userRegInfo) {

        return new UserFullInfo(userService.addUser(userRegInfo));
    }

    @GetMapping(value = "/{username}/user/detail_info")
    @ResponseBody
    public UserDetailInfo detailInfo(@PathVariable("username") String username) {

        return new UserDetailInfo(userService.findByUsername(username));
    }





}
