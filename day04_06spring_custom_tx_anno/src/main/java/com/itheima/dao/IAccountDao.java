package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();

    Account findById(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    Account findByName(String name);
}
