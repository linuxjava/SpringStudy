package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

    @Bean("queryRunner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(@Qualifier("dataSource") DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean("dataSource")
    public DataSource createDataSource(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
            comboPooledDataSource.setDriverClass(driverClass);
            comboPooledDataSource.setJdbcUrl(jdbcUrl);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        return comboPooledDataSource;
    }
}
