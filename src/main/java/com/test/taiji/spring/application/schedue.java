package com.test.taiji.spring.application;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class schedue implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("schedueTask init finish");
    }
}
