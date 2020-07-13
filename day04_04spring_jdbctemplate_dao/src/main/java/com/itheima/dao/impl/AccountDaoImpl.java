package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public Account findById(Integer id) {
        List<Account> list = getJdbcTemplate().query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return list.isEmpty() ? null : list.get(0);
    }

    public Account findByName(String name) {
        List<Account> list = getJdbcTemplate().query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if (list.isEmpty()) {
            return null;
        }

        if (list.size() > 1) {
            throw new RuntimeException("结果集不唯一");
        }

        return list.get(0);
    }

    public void update(Account account) {
        getJdbcTemplate().update("update account set name=?, money=? WHERE id = ?", account.getName(), account.getMoney(), account.getId());
    }
}
