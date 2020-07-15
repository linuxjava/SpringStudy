package com.itheima.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionUtils")
public class ConnectionUtils {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    @Autowired
    private DataSource dataSource;

    public Connection getThreadConnection(){
        Connection connection = tl.get();
        if(connection == null){
            try {
                connection = dataSource.getConnection();
                tl.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    public void removeConnection(){
        tl.remove();
    }
}
