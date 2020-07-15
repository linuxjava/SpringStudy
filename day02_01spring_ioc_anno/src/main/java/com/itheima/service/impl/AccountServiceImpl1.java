package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl1 implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public AccountServiceImpl1() {
        System.out.println("AccountServiceImpl");
    }

    public void saveAccount() {
        System.out.println("AccountServiceImpl saveAccount " + name + " " + age + " " + birthday);
    }

}
