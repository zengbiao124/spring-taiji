package com.test.taiji.spring.application;
import com.test.taiji.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.CollectionUtils;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println("SpringApplication的item:"+item));
        UserServiceImpl userServiceImpl =context.getBean(UserServiceImpl.class);
        userServiceImpl.save();
    }
}
