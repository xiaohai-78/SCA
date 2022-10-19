package org.example.service.Impl;


import org.apache.dubbo.config.annotation.Service;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User userInfo() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }
}