package com.itheima.jdbctemplate;

import com.itheima.dao.IAccountDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbctemplateDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);

        //System.out.println(accountDao.findByName("aaa"));
        System.out.println(accountDao.findById(1));
    }
}
