package com.test.taiji.spring.application;

public class SingleToUser {
    //构造方法私有化
    private SingleToUser() {
    }

    private static SingleToUser singleToUser;

    public static SingleToUser getInstance() {
        if (singleToUser == null) {
            singleToUser = new SingleToUser();
        }
        return singleToUser;
    }
}
