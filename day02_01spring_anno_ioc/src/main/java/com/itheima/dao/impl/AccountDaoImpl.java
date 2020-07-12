package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao{

    public AccountDaoImpl() {
        System.out.println("AccountDaoImpl");
    }

    public void saveAccount() {
        System.out.println("AccountDaoImpl saveAccount");
    }
}
