package com.java.day2.model;

/**
 * 用户类
 */
public class User {
    int age;
    String name;
    boolean male;
/*
这是重载的一种用法。同方法名，不同的参数列表
 */
    public User() {
    }

    public User(int age, String name, boolean male) {
        this.age = age;
        this.name = name;
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
