package com.itheima.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbctemplateDemo1 {
    public static void main(String[] args) {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/eesy_spring");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
        jdbcTemplate.execute("INSERT INTO account(NAME, money)VALUES('abc', 1001)");
    }
}
