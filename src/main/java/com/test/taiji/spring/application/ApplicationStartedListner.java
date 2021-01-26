package com.test.taiji.spring.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
@Component
public class ApplicationStartedListner implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        System.out.println(event.getTimestamp());
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println("ApplicationStartedListner的item:"+item));

    }
}
