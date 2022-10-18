package com.java.day2.controller;

import com.java.day2.model.User;

/**
 * 测试用户类
 */
public class UserTest {
    public static void main(String[] args) {
        System.out.println("测试开始");
        setUserName();
    }
    public static void setUserName(){
        User user = new User();
        user.setAge(1);
        user.setName("zhangsan");
        System.out.println(user.getName());

    }
}
