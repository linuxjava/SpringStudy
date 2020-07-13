package com.itheima.dao;

import com.itheima.domain.Account;

public interface IAccountDao {
    Account findById(Integer id);

    Account findByName(String name);

    void update(Account account);
}
