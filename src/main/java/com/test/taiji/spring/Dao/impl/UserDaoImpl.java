package com.test.taiji.spring.Dao.impl;

import com.test.taiji.spring.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao save");
    }
}
