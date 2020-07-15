package com.itheima.jdbctemplate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbctemplateDemo1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");
        jdbcTemplate.execute("insert into account(name,money)values('xiao',1000)");
    }
}
