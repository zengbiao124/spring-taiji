package com.test.taiji.spring.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.util.CollectionUtils;

@Configuration
@ComponentScan("com.test.taiji.spring")
public class AppConfig {

    @EventListener
    public void refeshListner(ContextRefreshedEvent event){
        System.out.println("AppConfig:"+event.getTimestamp());
        ApplicationContext context=event.getApplicationContext();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println("AppConfig的item:"+item));
    }
}
