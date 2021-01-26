package cn.com.taiji.spring.service;
import cn.com.taiji.spring.proxy.ProxyUserServiceJDK;
import com.test.taiji.spring.service.UserService;
import com.test.taiji.spring.service.impl.UserServiceImpl;
import org.junit.Test;

public class ProxyUserServiceTest {
    @Test
    public void testProxyUserService() {
        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServiceJDK() {
        ProxyUserServiceJDK proxyUserServiceJDK = new ProxyUserServiceJDK(new UserServiceImpl());
        UserService userService = (UserService) proxyUserServiceJDK.getProxy();
        userService.update();
    }

}
