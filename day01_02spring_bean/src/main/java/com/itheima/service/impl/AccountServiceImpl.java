package com.itheima.service.impl;

import com.itheima.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl");
    }

    public void saveAccount() {
        System.out.println("AccountServiceImpl saveAccount");
    }

    public void init(){
        System.out.println("init");
    }

    public void destory(){
        System.out.println("destory");
    }
}
