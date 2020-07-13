package com.itheima.jdbctemplate;

import com.itheima.domain.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbctemplateDemo2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");

        //保存
//        jdbcTemplate.update("insert into account(name,money)values('xiao',1000)");
        //更新
//        jdbcTemplate.update("update account set name=?, money=? WHERE id = ?", "xiao", 2000, 5);
        //删除
//        jdbcTemplate.update("DELETE from account WHERE id=?", 5);
        //查询多个
//        List<Account> accountList = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 1001);
//        System.out.println(accountList);
        //查询单个
//        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), 1);
//        System.out.println(list.isEmpty() ? "没有数据" : list.get(0).toString());
        //查询返回一行一列（使用聚合函数，但不加group by子句）
        Integer integer = jdbcTemplate.queryForObject("select count(*) from account where money > ?", Integer.class, 1000);
        System.out.println("查询到" + integer + "个数据");

    }
}
