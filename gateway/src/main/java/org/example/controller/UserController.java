package org.example.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Reference
    private UserService userService;

    @PostMapping("/userInfo")
    public User userInfo(){
        return userService.userInfo();
    }
}