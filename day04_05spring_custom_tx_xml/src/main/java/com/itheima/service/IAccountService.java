package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();

    Account findById(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    void transfer(String sourceName, String targetName, Float money);
}
