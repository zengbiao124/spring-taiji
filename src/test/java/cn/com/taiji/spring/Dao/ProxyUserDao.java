package cn.com.taiji.spring.Dao;

import com.test.taiji.spring.Dao.UserDao;

import java.util.Date;

public class ProxyUserDao implements UserDao {
    private UserDao userDao;

    public ProxyUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("执行前");
        Date start = new Date();
        userDao.save();
        Date end = new Date();
        System.out.println("执行后");
        System.out.println("执行时间：" + (end.getTime() - start.getTime()));
    }
}
