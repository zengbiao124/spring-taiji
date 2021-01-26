package cn.com.taiji.spring.Dao;

import com.test.taiji.spring.Dao.impl.UserDaoImpl;
import org.junit.Test;

public class ProxyUserDaoTest {
    @Test

    public void ProxyUserDaoTest() {
        ProxyUserDao proxyUserDao = new ProxyUserDao(new UserDaoImpl());
        proxyUserDao.save();
    }
}
