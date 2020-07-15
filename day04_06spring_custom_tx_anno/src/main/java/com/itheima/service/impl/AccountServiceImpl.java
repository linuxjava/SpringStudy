package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }


    public void transfer(String sourceName, String targetName, Float money) {
        Account sourceAccount = accountDao.findByName(sourceName);
        Account targetAccount = accountDao.findByName(targetName);

        if (sourceAccount != null && targetAccount != null) {
            sourceAccount.setMoney(sourceAccount.getMoney() - money);
            targetAccount.setMoney(targetAccount.getMoney() + money);

            update(sourceAccount);
            int a = 1 / 0;
            update(targetAccount);
        } else {
            throw new RuntimeException("转账错误");
        }
    }
}
