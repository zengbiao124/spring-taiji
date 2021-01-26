package com.test.taiji.spring.service.impl;

import com.test.taiji.spring.Dao.UserDao;
import com.test.taiji.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService save");
    }

    @Override
    public void update() {
        System.out.println("UserService update");
    }
}
