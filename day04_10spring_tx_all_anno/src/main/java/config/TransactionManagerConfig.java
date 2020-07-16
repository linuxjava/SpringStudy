package config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TransactionManagerConfig {
    @Bean("dataSourceTransactionManager")
    public DataSourceTransactionManager createJdbcTemplate(DriverManagerDataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
