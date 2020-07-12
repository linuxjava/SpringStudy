package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;


public class AccountDaoImpl implements IAccountDao{
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public List<Account> findAll() {
        try{
            return runner.query(connectionUtils.getThreadConnection(), "select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findById(Integer id) {
        try{
            return runner.query(connectionUtils.getThreadConnection(), "select * from account where id = ? ",new BeanHandler<Account>(Account.class),id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Account account) {
        try{
            runner.update(connectionUtils.getThreadConnection(), "insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Account account) {
        try{
            runner.update(connectionUtils.getThreadConnection(), "update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try{
            runner.update(connectionUtils.getThreadConnection(), "delete from account where id=?",id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Account findByName(String name) {
        try{
            List<Account> accountList = runner.query(connectionUtils.getThreadConnection(), "select * from account where name = ? ", new BeanListHandler<Account>(Account.class), name);
            if(accountList.size() > 1){
                throw new RuntimeException("数据不唯一");
            }
            return accountList.get(0);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
