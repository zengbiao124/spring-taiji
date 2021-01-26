package cn.com.taiji.spring.service;

import com.test.taiji.spring.service.UserService;

import java.util.Date;

public class ProxyUserService implements UserService {
    private UserService userService;

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save() {
        Date start = new Date();
        System.out.println("执行前");
        userService.save();
        Date end = new Date();
        System.out.println("执行后");
        System.out.println("执行时间：" + (end.getTime() - start.getTime()));
    }

    @Override
    public void update() {
        System.out.println("ProxyUserService update");
    }
}
